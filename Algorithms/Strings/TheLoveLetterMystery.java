import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, sum, temp, x;
        sc.nextLine();
        String a[]=new String[n];
        for(i=0; i<n; i++)
            a[i]=sc.nextLine();

        for(i=0; i<n; i++)
        {
            sum=0;
            x=a[i].length();
            if(x%2!=0)
            {
                for(j=0; j<=x/2; j++)
                {
                    temp=((a[i].charAt(j))-(a[i].charAt(x-j-1)));
                    if(temp<0)
                        temp*=-1;
                        sum+=temp;
                }
            }
            else
            {
                for(j=0; j<x/2; j++)
                {
                    temp=((a[i].charAt(j))-(a[i].charAt(x-j-1)));
                    if(temp<0)
                        temp*=-1;
                        sum+=temp;
                }
            }
            System.out.println(sum);
        }
    }
}
