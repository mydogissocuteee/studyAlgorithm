package trainingBaekjoon;

import java.util.Scanner;

public class nd0115_1789 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		int plus = 1;
		int sum = 0;
		while(true) {
			sum += plus;
			if(sum>s) break;
			plus ++;
		}
		
		System.out.println(plus-1);
		
	}
}
