import java.io.*;
import java.util.*;

public class GameOfThronesI {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();

        int i, j, c, odd=0, even=0;

        for(i=97; i<122; i++)
        {
            c=0;
            for(j=0; j<a.length(); j++)
            {
                if(a.charAt(j)==(char)i)
                    c++;
            }
            if(c%2==0)
                even++;
            else
                odd++;
        }
        if(odd>1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
