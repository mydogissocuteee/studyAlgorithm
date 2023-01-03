package trainingBaekjoon;

import java.util.Scanner;

public class d1223_2839 {

	public static void main(String[] args) {
		System.out.print("hi");
		Scanner in = new Scanner(System.in);
		
		int nn = in.nextInt();
		int answer = 0;
		
		if(nn%5==0) {
			answer = nn/5;
		}
		else if(nn==4||nn==7) {
			answer = -1;
		}
		else {
			while(true) {
				nn -=3;
				answer +=1;
				System.out.println("n의값" +nn);
				System.out.println("3을 뺀answer의값" +answer);
				
				if(nn%5==0) {
					answer+=(nn/5);
					System.out.println("더하기");
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
