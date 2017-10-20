import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
		int aa=-1, bb=-1, ans=0, i, j, t;
        int a[] = new int[n];
		int b[] = new int[n];
        for(i=0; i < n; i++){
            t = in.nextInt();
 			if(t%k==0)
				a[++aa]=t;
			else
				b[++bb]=t;	
        }
		
		
		if(aa==1)
			ans +=1;
		else if(aa>1)
			ans = ((aa)*(aa+1))/2;
		
		
		
		if (bb==1){
			if((b[0]+b[1])%k==0)
				ans++;
		}
		else if(bb>1){
			for(i=0; i<=bb-1; i++){
				for(j=i+1; j<=bb; j++){
					if((b[i]+b[j])%k==0)
						ans++;
				}
			}
		}
		System.out.println("\n"+ans);
    }
}
