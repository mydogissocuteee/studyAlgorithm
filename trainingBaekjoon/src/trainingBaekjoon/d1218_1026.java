package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class d1218_1026 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int[] a = new int[nn];
		int[] b = new int[nn];
		
		for (int i =0;i<nn;i++) a[i]=in.nextInt();
		for (int i =0;i<nn;i++) b[i]=in.nextInt();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int s = 0;

		for (int i =0;i<nn;i++) {
			s += (a[i]*b[nn-i-1]);
		}
		
		System.out.println(s);
	}

}
