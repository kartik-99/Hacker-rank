import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int d;
        int a[]=new int[n];
        int i, j, in;
        for(i=0; i<n; i++)
        {
            a[i]=1;
            in=sc.nextInt();
            for(j=1; j<=in; j++)
            {
                if(j%2==0)
                    a[i]++;

                else
                    a[i]*=2;
            }
        }

        for(i=0; i<n; i++)
            System.out.println(a[i]);
    }
}
