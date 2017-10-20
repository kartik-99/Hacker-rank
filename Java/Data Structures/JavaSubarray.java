import java.io.*;
import java.util.*;

public class JavaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, i, j, sum;
        int a[] = new int[n];
        for(i=0; i<n; i++){
        	a[i] = sc.nextInt();
        }

        for(i=0; i<n-1;i++){
        	sum = a[i];
            if(sum<0)
                ans++;
        	for(j=i+1; j<n; j++){
                sum+=a[j];
                if(sum<0)
                    ans++;
        	}
        }
        System.out.println(ans);
    }
}