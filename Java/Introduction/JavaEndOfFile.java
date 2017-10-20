import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 0;
        StringBuffer ans = new StringBuffer("");
        String a, b;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine() && !((a = sc.nextLine()).equals(""))){
        	;
        	b = (++i)+" "+a+"\n";
        	//System.out.println(ans);
        	ans.append(b);
        }
        System.out.println(ans);
    }
}