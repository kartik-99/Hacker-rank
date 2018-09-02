import java.math.*;
import java.util.*;
class fact{
    static BigInteger fact[] = new BigInteger[41];
    static int p[] = {1, 1, 1, 2, 3, 4, 5, 7};
    static int primes[] = new int[100000];
    static int pat = 4;
    public static void main(String args[]){
        calc();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n, combos;
        while(T>0){
            n = sc.nextInt();
            combos = findCombos(n);
            System.out.println(primesBefore(combos));
            T--;
        }
        sc.close();
    }
    public static int findCombos(int n){
        int f, nf, i, combos;
        if(n<=8)
                combos = p[n-1];
        else{
            f = n/4;
            combos = n-2;
            for(i=2; i<=f; i++){
                nf = n-(4*i);
                combos+= (fact[i+nf].divide(fact[i].multiply(fact[nf]))).intValue();
            }
        }
        return combos;
    }

    public static int primesBefore(int n){
        if(n>primes[pat-1]){
            for(int i = primes[pat-1]+1; i<=n; i++){
                if(isPrime(i)){
                    primes[pat++] = i;
                }
            }
            return pat;
        }else if(n==primes[pat-1]){
            return pat;
        }else{
            for(int i=0; i<pat; i++){
                if(primes[i]>n)
                    return i;
            }
        }
        return 0;
    }

    public static boolean isPrime(int n){
        for(int i=0; i<pat; i++)
            if(n%primes[i]==0)
                return false;
        return true;
    }

    public static void calc(){
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        fact[0] = BigInteger.ONE;
        for(int i=1; i<=40; i++)
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
    }
}