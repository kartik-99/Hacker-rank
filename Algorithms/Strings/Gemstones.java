import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        int i, j, x, c=0, m=0, k, sum=0;
        for(i=0; i<n; i++)
            a[i]=sc.nextLine();

        for(i=97; i<=122; i++)
        {
            m=0;
            for(j=0; j<n; j++)
            {
                c=0;
                for(k=0; k<a[j].length();k++)
                {
                    if((int)a[j].charAt(k)==i)
                    {
                        c++;
                        break;
                    }
                }
                if(c!=0)
                    m++;
            }
            if(m==n)
                sum++;
        }

        System.out.println(sum);
    }
}
