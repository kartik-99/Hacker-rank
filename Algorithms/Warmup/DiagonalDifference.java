import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j, d1=0, d2=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(n%2==1 && i==j && i+j==(n-1))
                    continue;
                else if(i==j)
                    d1+=a[i][j];
                else if(i+j==(n-1))
                    d2+=a[i][j];
            }
        }
        int ans=((d1-d2)>0)?d1-d2:d2-d1;
        System.out.println(ans);
    }
}
