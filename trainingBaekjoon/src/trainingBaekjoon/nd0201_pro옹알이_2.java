package trainingBaekjoon;

import java.util.ArrayList;


public class nd0201_pro옹알이_2 {
	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa"};
		System.out.println("결과1."+solution(babbling));
		String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println("결과2."+solution(babbling2));
	}
	
	// 발음 가능 "aya", "ye", "woo", "ma"
	public static int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
        	if(str.contains("ayaaya")||str.contains("yeye")||str.contains("woowoo")||str.contains("mama"))continue;
        	str = str.replaceFirst("aya", "");
        	str = str.replaceFirst("ye", "");
        	str = str.replaceFirst("woo", "");
        	str = str.replaceFirst("ma", "");
        	if(str.length()==0) answer++; 
        }
        
        return answer;
    }
	
}
