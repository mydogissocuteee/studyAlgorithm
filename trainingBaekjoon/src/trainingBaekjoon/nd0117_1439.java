package trainingBaekjoon;

import java.util.Scanner;

public class nd0117_1439 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		String[] arr = s.split("");
		String pin = arr[0];
		int cnt = 1;
		
		// 1100110011001100001 이라면?
		for(int i=1;i<arr.length;i++) {
			if(arr[i].equals(pin));
			else {
				cnt++;
				pin=arr[i];
			}
		}
		System.out.println(cnt/2);
}
}
