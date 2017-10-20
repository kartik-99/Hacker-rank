import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaDateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        int m = Integer.valueOf(month);m--;
        int d = Integer.valueOf(day);
        int y = Integer.valueOf(year);

        Date date= (new GregorianCalendar(y, m, d)).getTime();
   		SimpleDateFormat f = new SimpleDateFormat("EEEE");
     	String ans=(f.format(date)).toUpperCase();
     	System.out.println(ans);
    }
}
