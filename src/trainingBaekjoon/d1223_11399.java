package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class d1223_11399 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int[] arr = new int[nn];
		for(int i =0;i<nn;i++) arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		
		int sum = 0;
		
		for(int i =0;i<nn;i++) sum+=arr[i]*(nn-i);
		System.out.println(sum);
		
	}

}
