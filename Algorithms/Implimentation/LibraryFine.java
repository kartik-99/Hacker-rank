import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int fine = 0;


        if(m1==m2 && y1==y2)
        {
            if(d1<=d2)
                fine=0;
            else
                fine = ((d1-d2)*15);
        }
        else if(y1==y2 && m1>m2)
            fine = (m1-m2)*500;
        else if(y1>y2)
            fine=10000;

        System.out.println(fine);
    }
}
