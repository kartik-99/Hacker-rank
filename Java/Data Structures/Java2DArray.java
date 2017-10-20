import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        int i, j, sum, maxSum = -9999;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(i = 1; i<5; i++){
        	for(j = 1; j<5; j++){
        		sum = 0;
        		sum += a[i-1][j-1] + a[i-1][j] + a[i-1][j+1] + a[i][j] + a[i+1][j-1] + a[i+1][j] + a[i+1][j+1];
        		if(sum>=maxSum)
        			maxSum = sum;
        	}
        }
        System.out.println(maxSum);
    }
}
