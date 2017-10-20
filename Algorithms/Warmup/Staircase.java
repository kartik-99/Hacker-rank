import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        for(i=1; i<=n; i++)
        {
            for(int sp=0; sp<(n-i); sp++)
                System.out.print(" ");

            for(j=1;j<=i;j++)
                System.out.print("#");

            System.out.println();
        }
    }
}
