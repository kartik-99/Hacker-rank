import java.io.*;
import java.util.*;
import java.math.*;

public class ExtraLongFactorials {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        BigInteger a= new BigInteger("1");

        for(int i=1; i<=n; i++)
        {
            BigInteger b = BigInteger.valueOf(i);
            a=b.multiply(a);
        }
		System.out.println(a);
    }
}
