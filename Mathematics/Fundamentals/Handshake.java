import java.io.*;
import java.util.*;

public class Handshake {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i, j, a;
        int ans[]=new int[n];
        ans[0]=0;
        for(i=0; i<n; i++)
        {
            a=sc.nextInt();
            for(j=a; j>1; j--)
                ans[i]+=(j-1);
        }
        for(i=0; i<n; i++)
            System.out.println(ans[i]);
    }
}
