import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i, j, c=0, m=0;
        String a=sc.nextLine();
        for(i=97;i<=122;i++)
        {
            c=0;
            for(j=0; j<a.length(); j++)
            {
                if((int)a.charAt(j)==i ||(int)a.charAt(j)==i-32)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                m++;
                System.out.println("not pangram");
                break;
            }
        }
        if(m==0)
                System.out.println("pangram");
    }
}
