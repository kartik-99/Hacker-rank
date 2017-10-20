import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] a=new int[2];
        a[0]=0;
        if(a0>b0)
            a[0]++;
        else if(a0<b0)
            a[1]++;
        if(a1>b1)
            a[0]++;
        else if(a1<b1)
            a[1]++;
        if(a2>b2)
            a[0]++;
        else if(a2<b2)
            a[1]++;

        System.out.print(a[0]+" "+a[1]);

    }
}
