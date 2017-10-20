import java.io.*;
import java.util.*;

public class javaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
		System.out.println(a.length() + b.length());

		int n = a.compareToIgnoreCase(b);
		if(n>0)
			System.out.println("Yes");
		else
			System.out.println("No");

		//String ans = a.toLowerCase()+" "+b.toLowerCase();
        String ans = Character.toUpperCase(a.charAt(0))+a.substring(1)+" "+Character.toUpperCase(b.charAt(0))+b.substring(1);
        System.out.println(ans);

    }
}
