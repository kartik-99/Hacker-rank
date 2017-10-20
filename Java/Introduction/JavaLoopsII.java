import java.io.*;
import java.util.*;

public class JavaLoopsII {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][3];
        int i, j, temp;
        for(i=0; i<n; i++)
        {
            for(j=0; j<3; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(i=0; i<n; i++)
        {
            temp=a[i][0];
            for(j=0; j<a[i][2]; j++)
            {
                temp+=(Math.pow(2, j))*a[i][1];
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
