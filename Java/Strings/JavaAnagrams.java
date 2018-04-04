import java.io.*;
import java.util.*;

public class JavaAnagrams {
    //////////////////////////////////////////////////
        static boolean isAnagram(String s1, String s2) {
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", ""); 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
            status = false;
        else{
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);
        }return status;
    }
    ////////////////////////////////////////////////////

      public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
