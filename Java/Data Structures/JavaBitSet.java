import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		BitSet[] B = new BitSet[3];
		for (int i = 1; i < B.length; i++) {
			B[i] = new BitSet(N);
		}
        char ch;
		for (int i = 0; i < M; i++) {
			String operation = sc.next();
			int arg1 = sc.nextInt();
			int arg2 = sc.nextInt();
            ch = operation.charAt(0);
            
            switch(ch){
                case 'A': B[arg1].and(B[arg2]); break;
                case 'O': B[arg1].or(B[arg2]); break;
                case 'X': B[arg1].xor(B[arg2]); break;
                case 'F': B[arg1].flip(arg2); break;
                case 'S': B[arg1].set(arg2); break;
            }

			System.out.println(B[1].cardinality() + " " + B[2].cardinality());
		}

		sc.close();
	}
}