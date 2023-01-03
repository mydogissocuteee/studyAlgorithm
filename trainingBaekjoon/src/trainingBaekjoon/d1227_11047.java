package trainingBaekjoon;

import java.util.Scanner;

public class d1227_11047 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int kk = in.nextInt();
		int[] arr = new int[nn];
		for(int i =0;i<nn;i++) arr[i] = in.nextInt();
		
		int sum =0;
		for(int i=nn-1;i>=0;i--) {
			sum += (kk/arr[i]);
			kk-=arr[i]*(kk/arr[i]);
		}
		System.out.println(sum);
		

	}

}
