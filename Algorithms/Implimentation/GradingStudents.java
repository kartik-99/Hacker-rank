import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
        int res[] = new int[grades.length];
        for(int i=0; i<grades.length; i++){
            if(((grades[i])%5==0)|| grades[i]<38)
                res[i] = grades[i];
            else if((grades[i]+1)%5==0)
                res[i] = grades[i]+1;
            else if((grades[i]+2)%5==0)
                res[i] = grades[i]+2;
            else
                res[i] = grades[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != n - 1 ? " " : ""));
            System.out.println("");
        }



    }
}
