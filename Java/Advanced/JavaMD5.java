import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class JavaMD5 {
 
    public static String md5OfString(String str){
        StringBuilder sb = new StringBuilder();
 
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] digest = md.digest();
 
            for(byte dByte : digest){
                sb.append(String.format("%02x", dByte & 0xff));
            }
        } catch(NoSuchAlgorithmException e) {
            System.out.println(e);
        } catch(NullPointerException e){
            System.out.println("NullPointerException: Please provide a valid string");
        }
        return sb.toString();
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Solution.md5OfString(s));
    }
 
}