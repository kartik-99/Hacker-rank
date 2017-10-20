import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=0, ne=0, z=0, i;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        for(i=0; i<n; i++)
        {
            if(arr[i]>0)
                p++;
            else if(arr[i]==0)
                z++;
            else
                ne++;
        }
        System.out.println((double)((double)p/(double)n));
        System.out.println((double)((double)ne/(double)n));
        System.out.println((double)((double)z/(double)n));
    }
}
