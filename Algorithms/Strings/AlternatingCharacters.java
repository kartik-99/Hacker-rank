import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        String s[]=new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            s[i]=sc.nextLine();
        }



        for(int i=0; i<n; i++)
        {
            c=0;
            for(int j=1; j<s[i].length(); j++)
            {
               if(s[i].charAt(j)==s[i].charAt(j-1))
                   c++;
            }
            System.out.println(c);
        }
    }
}
