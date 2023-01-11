package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class nd0111_13305 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nn = in.nextInt();
		int answer =0 ;
		
		int[] distant = new int[nn-1]; 
		int[] price = new int[nn]; 
		int sum = 0;
		for(int i = 0; i < distant.length; i++) sum+= distant[i]; //거리의 총합
		
		for(int i = 0;i<nn-1;i++) distant[i] = in.nextInt();
		for(int i = 0;i<nn;i++) price[i] = in.nextInt();
		
		// 첫번째 지역의 기름값이 가장 쌀 경우
		if(price[0] == Arrays.stream(price).min().getAsInt()) answer = price[0]*sum;
		
		else {
			
			for(int i = 0;i<nn-1;i++) {
				
				
			}
			
		}
		
	}

}
