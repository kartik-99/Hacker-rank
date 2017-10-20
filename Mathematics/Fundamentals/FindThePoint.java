import java.io.*;
import java.util.*;

public class FindThePoint {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][4];
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<4; j++)
                a[i][j]=sc.nextInt();
        }

        for(i=0; i<n; i++)
        {
            System.out.println((2*a[i][2]-a[i][0])+" "+(2*a[i][3]-a[i][1]));
        }
    }
}
