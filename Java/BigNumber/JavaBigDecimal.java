import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();


        Arrays.sort(s, (number1, number2) -> new BigDecimal(number2).compareTo(new BigDecimal(number1)));



        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
