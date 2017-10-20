import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
		int d = x1-x2;
		int temp;
		d=(d>0)?d:-1*d;

        if((x1	>x2 && v1>v2) || (x1<x2 && v1<v2))
			System.out.println("NO");
		else if(x1!=x2 && v1==v2)
			System.out.println("NO");
		else{
			do{
				x1+=v1;
				x2+=v2;
				temp = (x1-x2>0)?(x1-x2):(x1-x2)*-1;
				if(d<temp){
					System.out.println("NO");
					break;
				}
				d=temp;
				if(temp==0){
					System.out.println("YES");
				}
			}while(d!=0);

		}
    }
}
