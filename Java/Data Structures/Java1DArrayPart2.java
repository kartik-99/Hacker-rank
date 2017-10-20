import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Java1DArrayPart2
{

    static boolean winStatus(String[] array,int jumpLength, int currentPos,int lastJumpPos)
    {

        boolean win = false;

        int range = currentPos;

        while(range < array.length-1 && array[range+1].equals("0")){
            range++;
        }
        if(range == array.length-1) return true;

        int lowRange = range;
        while(lowRange>lastJumpPos && array[lowRange-1].equals("0") && (lowRange+jumpLength) > range+1 ){
            lowRange--;
        }
        currentPos = lowRange;
        for(int i = currentPos;i<=range;i++){
            if((i+jumpLength)<array.length && array[i+jumpLength].equals("0")  && jumpLength!=0){
                win = winStatus(array,jumpLength,i+jumpLength,i);
            }

            if(win || (i+jumpLength)>=array.length || (i+1)>=array.length){
                win = true;
                break;
            }
        }

        return win;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i=0;i<numCases;i++){
            int arraySize = sc.nextInt();
            int jumpLength = sc.nextInt();
            sc.nextLine();
            String[] array = sc.nextLine().split(" ");
            if(winStatus(array,jumpLength,0,0)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
            }
        }
    }
}
