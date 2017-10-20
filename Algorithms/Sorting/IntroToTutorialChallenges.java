import java.io.*;
import java.util.*;

public class IntroToTutorialChallenges {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0; i<n; i++)
            a[i]=sc.nextInt();

        for(i=0; i<n; i++)
        {
            if(v==a[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}
