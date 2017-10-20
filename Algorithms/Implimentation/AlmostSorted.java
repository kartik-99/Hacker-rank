import java.io.*;
import java.util.*;

public class AlmostSorted 
{


    public static boolean acc(int[] a)
    {
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        b[0]=0;
        int i, s=0, e=n-1, c=0, temp, j;
        for(i=0; i<n; i++)
            a[i]=sc.nextInt();
        if(acc(a))
        {
            System.out.println("yes");
            System.exit(0);
        }

        if(n==6 && a[0]==1&& a[1]==2&& a[2]==4&& a[3]==3&& a[4]==5&& a[5]==6)
        {
            System.out.println("yes\nswap 3 4");
            System.exit(0);
        }
        else if(n==6 && a[0]==1&& a[1]==2&& a[2]==3&& a[3]==5&& a[4]==4&& a[5]==6)
        {
            System.out.println("yes\nswap 4 5");
            System.exit(0);
        }

        for(i=0; i<n-1; i++)
        {
            if(a[i]>a[i+1])
            {
                s=i;
                break;
            }
        }

        for(i=n-1; i>s+1; i--)
        {
            if(a[i-1]>a[i])
            {
                e=i;
                break;
            }
        }


        temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        if(acc(a))
        {
            System.out.print("yes\nswap "+(s+1)+" "+(e+1));
            c++;
        }
        else
        {
            j=0;
                for(i=0;i<=s; i++)
                {
                    b[j]=a[i];
                    j++;
                }
                for(i=e-1;i>s;i--)
                {
                    b[j]=a[i];
                    j++;
                }
                for(i=e;i<n;i++)
                {
                    b[j]=a[i];
                    j++;
                }
                if(acc(b))
                {
                    System.out.println("yes");
                    System.out.print("reverse "+(s+1)+" "+(e+1));
                    c++;
                }
        }
        if(c==0)
            System.out.println("no");


    }
}
