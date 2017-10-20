import java.io.*;
import java.util.*;

public class CircularArrayRotation {

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
        int k, q, r=0;
        int n;
        int i;

        n=sc.nextInt();
        k=sc.nextInt();
        q=sc.nextInt();
        int a[]=new int[2*n];
        int ans[]=new int[q];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
            a[i+n]=a[i];
        }

        for(i=0; i<q; i++)
            ans[i]=sc.nextInt();

        while(k>n)
        {

            k-=n;
        }
        r=n-k;

        for(i=0; i<q; i++)
        {
            System.out.println(a[r+ans[i]]);
        }
    }
}
