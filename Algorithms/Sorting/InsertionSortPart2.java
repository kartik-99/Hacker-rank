import java.io.*;
import java.util.*;

public class InsertionSortPart2 {

    public static void insertionSortPart2(int[] ar)
    {


        int n=ar.length;
        int i, j, m, temp, k, wow=0;
        for(i=0; i<n-1; i++)
        {
            if(ar[i+1]<ar[i])
            {
                m=0;
                if(ar[0]>ar[i+1])
                    m=0;
                else
                {
                    for(j=1; j<=i; j++)
                    {
                        if(ar[j]>ar[i+1])
                        {
                            m=j;
                            break;
                        }
                    }
                }

                temp=ar[i+1];
                for(k=i;k>=m; k--)
                {
                    ar[k+1]=ar[k];
                }
                ar[m]=temp;

                i=0;
            }
            if(i==wow)
            {
                printArray(ar);
                wow++;
            }
        }

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
       }
       insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
