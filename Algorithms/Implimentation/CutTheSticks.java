import java.io.*;
import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

			int n=sc.nextInt();
			int a[]=new int[n];
			int i, s=0, count, temp;
			for(i=0; i<n; i++){
				a[i]=sc.nextInt();
				if(a[i]<s) s=a[i];
			}

			System.out.println(n);
			do{
				count =0;
				temp=s;
				for(i=0; i<n; i++)
				{
					if(a[i]>0)
						a[i]-=s;

					if(a[i]>0)
					{
						count++;
						if(a[i]<temp)
							temp = a[i];
					}

				}
				System.out.println(count);

			}while(count!=1);
    }
}
