import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPart1 {



    public static void insertIntoSorted(int[] ar) {
          int i, j;
          int inserted = 0;
          i = ar[ar.length-1];

          for (j = ar.length-2; j > -1; j--){
              if (ar[j] > i){
                  ar[j+1] = ar[j];
                  printArray(ar);
              } else if (ar[j] <= i){
                  ar[j+1] = i;
                  inserted = 1;
                  break;
              }
          }

          if(inserted == 0){
              ar[0] = i;
          }

          printArray(ar);
    }


/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
         }
         insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }


}
