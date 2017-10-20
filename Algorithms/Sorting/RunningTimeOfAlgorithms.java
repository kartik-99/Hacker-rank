import java.io.*;
import java.util.*;

public class RunningTimeOfAlgorithms 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k, m, temp, t=0;
        n=sc.nextInt();
        int a[]=new int[n];

        for(i=0; i<n; i++)
            a[i]=sc.nextInt();



        for(i=0; i<n-1; i++)
        {
            if(a[i+1]<a[i])
            {
                m=0;
                if(a[0]>a[i+1])
                    m=0;
                else
                {
                    for(j=1; j<=i; j++)
                    {
                        if(a[j]>a[i+1])
                        {
                            m=j;
                            break;
                        }
                    }
                }

                temp=a[i+1];
                for(k=i;k>=m; k--)
                {
                    a[k+1]=a[k];
                    t++;
                }
                a[m]=temp;

                i=0;
            }
        }
        System.out.println(t);
    }
}
