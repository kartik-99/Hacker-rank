import java.io.*;
import java.util.*;

public class CorrectnessAndTheLoopInvariant {

    public static void insertionSort(int[] a)
    {
        int i, j, temp, m;
        int n=a.length;
        for(i=0; i<n-1; i++)
        {
            m=i;
            for(j=i+1; j<n; j++)
            {
                if(a[m]>a[j])
                    m=j;
            }
            if(i!=m)
            {
                temp=a[i];
                a[i]=a[m];
                a[m]=temp;
            }
        }


        printArray(a);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
