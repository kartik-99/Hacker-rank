import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaArraylist {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        int i, j, d, n, t, x, y;
        
        
        n = sc.nextInt();
        for(i = 0; i<n; i++){
            List<Integer> temp = new ArrayList<Integer>();
            d = sc.nextInt();
            for(j=0; j<d; j++){
                t = sc.nextInt();
                temp.add(t);
            }
            a.add(temp);
        }
        
        
        n = sc.nextInt();
        for(i = 0; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(y > a.get(x-1).size())
	            System.out.println("ERROR!");        
            else
                System.out.println(a.get(x-1).get(y-1));
        }
    }
}