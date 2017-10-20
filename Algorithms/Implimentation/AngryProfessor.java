import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int i, j, b, c, d, min;
        boolean a[]=new boolean[n];
        a[0]=false;
        for(i=0; i<n; i++)
        {
            b=sc.nextInt();
            min=sc.nextInt();
            c=0;
            for(j=0; j<b; j++)
            {
                d=sc.nextInt();
                if(d<=0)
                    c++;
            }
            if(c>=min)
                a[i]=true;
            else
                a[i]=false;
        }


        for(i=0; i<n; i++)
        {
            if(a[i]==true)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
