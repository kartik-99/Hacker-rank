import java.io.*;
import java.util.*;

public class Quicksort1Partition{

    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
	   	int n=sc.nextInt();
	   	int[] left=new int[n];
	   	int[] right=new int[n];
	   	int p=sc.nextInt();
	   	int i, r, ll=0, rr=0;
	   	for(i=1; i<n; i++)
	   	{
			r=sc.nextInt();
			if(r>p)
				right[rr++]=r;
			else
				left[ll++]=r;
	   }
	   for(i=0; i<ll; i++)
	   		System.out.print(left[i]+" ");
	   System.out.print(p+" ");
		for(i=0; i<rr; i++)
	   		System.out.print(right[i]+" ");
    }
}
