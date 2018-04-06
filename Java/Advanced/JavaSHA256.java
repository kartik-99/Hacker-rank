import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
public class JavaSHA256 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
	        String data = sn.nextLine();
	        Solution sj = new Solution();
	        String hash = sj.getSHA256Hash(data);
	        System.out.println(hash.toLowerCase());
    }
    
    private String getSHA256Hash(String data) {
	        String result = null;
	        try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] hash = digest.digest(data.getBytes("UTF-8"));
	            return bytesToHex(hash);
	        }catch(Exception ex) {
	            ex.printStackTrace();
	        }
	        return result;
	    }
    
    private String  bytesToHex(byte[] hash) {
	        return DatatypeConverter.printHexBinary(hash);
	    }
}