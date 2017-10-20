import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, ans=0;

        int c[] = new int[n];
        for(i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        i=0;
        do{
            if(i+2<=n-1 && c[i+2]==0)
                i=i+2;

            else
                i++;
            ans++;
        }while(i!=n-1);
        System.out.println(ans);
    }
}
