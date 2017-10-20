import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i, j, a, temp, d;
        int ans[]=new int[n];
        ans[0]=0;
        for(i=0; i<n; i++)
        {
            a=sc.nextInt();
            temp=a;
            while(temp!=0)
            {
                d=temp%10;
                temp/=10;
                if(d==0)
                    continue;
                if(a%d==0)
                    ans[i]++;
            }
        }

        for(i=0; i<n; i++)
            System.out.println(ans[i]);
    }
}
