import java.io.*;
import java.util.*;

public class SaveThePrisoner {

    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int nn=sc.nextInt();
		int[] a=new int[nn];
		int n, m, s, i;
		for(int lol=0; lol<nn; lol++)
		{
			n=sc.nextInt();
			m=sc.nextInt();
			s=sc.nextInt();

			if(s+m-1<n)
				a[lol]=s+m-1;
			else
			{
				m-=(n-s+1);
				a[lol]=m%n;
				if(a[lol]==0)
					a[lol]=n;
			}
		}


		for (i=0; i<nn; i++)
			System.out.println(a[i]);
    }
}
