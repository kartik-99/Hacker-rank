import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String h=time.substring(0, 2);
        int hh=Integer.parseInt(h);
        if(time.substring(8).equalsIgnoreCase("pm"))
        {
            if(hh!=12)
                hh+=12;
            String t=Integer.toString(hh)+time.substring(2, 8);
            System.out.println(t);
        }
        else if(time.substring(8).equalsIgnoreCase("am") && hh==12)
        {
            hh=00;
            String t="00"+time.substring(2, 8);
            System.out.println(t);
        }
        else
            System.out.println(time.substring(0,8));
    }
}
