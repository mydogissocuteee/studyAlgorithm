package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class nd0111_13305 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nn = 0;
		nn = in.nextInt();
		int answer =0 ;
		
		int[] distant = new int[nn-1]; // 주유소 간 거리 2 3 1
		int[] price = new int[nn-1]; // 주유소 당 가격 5 2 4 1
		int sum = 0; // 남은 거리의 총합
		
		for(int i = 0;i<nn-1;i++) distant[i] = in.nextInt();
		for(int i = 0;i<nn-1;i++) price[i] = in.nextInt();
		
		for(int i = 0; i < distant.length; i++) sum += distant[i]; // 거리의 총합 계산해두기
		
		// 첫번째 지역의 기름값이 가장 쌀 경우
		if(price[0] == Arrays.stream(price).min().getAsInt()) {
			System.out.println("가격"+price[0]);
			System.out.println(sum);
			answer = price[0]*sum;
		}
		
		else {
			// 첫번째 주유소에서 두번째 주유소 갈만큼만 주유하기
			answer += price[0]*distant[0];
			sum -= distant[0];
			
			for(int i = 1;i<nn-1;i++) {
				
				// 다음 주유소에서 나머지 주유소의 가격과 비교하여 최소값이면 남은 거리만큼 모두 주유 후 break
				if(price[i] > price[i+1]) {
					answer += price[i]*distant[i];
					sum -= distant[i];
					
				} 
				// 아니면 계속 반복
				else {
					answer += price[i]*sum;
					break;
				}
				
			}
			
		}
		
		System.out.println(answer);
		
	}

}
