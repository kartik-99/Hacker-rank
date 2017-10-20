import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int len = a.length();
        int i;
        for(i=0; i<len/2; i++)
        {
            if(a.charAt(i) != a.charAt(len-i-1))
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
