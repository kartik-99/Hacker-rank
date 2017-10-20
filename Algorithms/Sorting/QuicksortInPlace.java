import java.io.*;
import java.util.*;

public class QuicksortInPlace
{
   	static void sort(int[] a, int start, int end, int n)
    {
        int i;
        if(start<end)
		{
	        int pivot = partition(a, start, end);
			print(a);


			if(start<pivot-1)
	        {sort(a, start, pivot-1, n);}

			if(pivot+1<end-1)
			{sort(a, pivot+1, end, n);}



		}
		return;

    }




    static int partition(int[] a, int start, int end)
    {
        int pivot = a[end];
        int p = start;
        int i, temp;
        for(i=start; i<end; i++)
        {
            if(a[i]<=pivot)
            {
                temp= a[i];
                a[i]= a[p];
                a[p]= temp;
                p++;
            }
        }

        temp=a[p];
        a[p]=a[end];
        a[end]=temp;

        return p;
    }


	static void print(int[] array) {

		for (int element : array) {
			print(element);
		}

		System.out.println("");
	}

	static void print(int element) {
		System.out.print(Integer.toString(element) + " ");
	}


	public static void main(String[] args)
    {
		Scanner sc= new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[]=new int[n];
        int i;

        for(i=0; i<n; i++)
            a[i]= sc.nextInt();

        sort(a, 0, n-1, n);

		//for(i=0; i<n; i++)
			//System.out.print(a[i]+" ");
    }
}
