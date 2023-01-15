package trainingBaekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nd0113_2217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		// 역순 정렬 reverseOrder을 사용하기 위해 int 가 아닌 Integer으로 선언
		Integer[] arr = new Integer[n];
		for (int i =0;i<n;i++) arr[i] = in.nextInt();
		
		// 중량이 큰 로프부터 계산하기 위해 역순으로 정렬
		Arrays.sort(arr, Collections.reverseOrder()); 
		
		int max = 0;
		for(int i = 0 ; i<n ; i++) {
			
			if(arr[i]*(i+1) > max) max = arr[i]*(i+1);
			// arr[i]*(i+1) = 로프 중 최소 중량 * 로프 개수
			
		}
		
		System.out.println(max);
		
	}
}
