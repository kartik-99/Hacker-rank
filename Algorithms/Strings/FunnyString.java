import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b;
        int i, j, x, y, c;
        for(i=0; i<n; i++)
            a[i]=sc.nextLine();

        for(i=0;i<n;i++)
        {
            b="";
            for(j=a[i].length()-1; j>=0; j--)
                b=b+a[i].charAt(j);
            c=0;
            for(j=1; j<a[i].length(); j++)
            {
                x=(int)(a[i].charAt(j)-a[i].charAt(j-1));
                if(x<0)
                    x*=-1;

                y=(int)(b.charAt(j)-b.charAt(j-1));
                if(y<0)
                    y*=-1;

                if(x!=y)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");

        }
    }
}
