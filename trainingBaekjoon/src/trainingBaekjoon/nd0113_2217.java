package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class nd0113_2217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i =0;i<n;i++) arr[i] = in.nextInt();
		
		int answer = Arrays.stream(arr).min().getAsInt();
		answer *= n;
		System.out.println(answer);
		
	}
}
