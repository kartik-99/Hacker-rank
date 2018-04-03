import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, t, x, y;
        String s;
        List<Integer> a = new ArrayList<Integer>();
        n = sc.nextInt();
        for(i = 0; i<n; i++){
            t = sc.nextInt();
            a.add(t);
        }
        
        n = sc.nextInt();
        for(i = 0; i<n; i++){
            s = sc.next();
            if(s.equals("Insert")){
                x = sc.nextInt();
                y = sc.nextInt();
                a.add(x, y);
            }else{
                x = sc.nextInt();
                a.remove(x);
            }   
        }
        
        for(int ii:a)
            System.out.print(ii +" ");
    }
}
