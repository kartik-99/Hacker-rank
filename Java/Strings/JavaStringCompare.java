import java.io.*;
import java.util.*;

public class JavaStringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = sc.nextInt();
        String temp;
        int c, i;
        String s = "";
        String b = "";
        for(i = 0; i<=a.length()-n; i++)
        {
            temp = a.substring(i, i+n);
            c=s.compareTo(temp);
            if(c>0 || s.isEmpty())
                s=temp;

            c=b.compareTo(temp);
            if(c<0 || b.isEmpty())
                b=temp;

        }

        System.out.println(s+"\n"+b);

    }
}
