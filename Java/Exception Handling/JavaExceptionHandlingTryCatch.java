import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n1, n2, nQuotient;
        Scanner input = new Scanner(System.in); 
        try{
            n1 = input.nextInt();
            n2 = input.nextInt();
            nQuotient = n1/n2;
            System.out.println(nQuotient);
        } 
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}