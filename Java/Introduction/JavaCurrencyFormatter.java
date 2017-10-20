import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us, india, china, france;
        
        // Write your code here.
        us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment);
        india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment);
        france = NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
