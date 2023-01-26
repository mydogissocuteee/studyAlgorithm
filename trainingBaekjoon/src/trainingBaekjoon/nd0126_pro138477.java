package trainingBaekjoon;

import java.util.Arrays;

public class nd0126_pro138477 {
	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		for(int i : solution(k, score)) System.out.println(i);
	}
	
	public static int[] solution(int k, int[] score) {
        int[] answer = {};
        int[] rank = new int[k];
        for(int i = 0; i<score.length; i++) {
        	if(score[i]>rank[0]) {
        		rank[0] = score[i];
        		Arrays.sort(rank);
        	}
        	for(int j : rank) System.out.print(j+" ");
        	System.out.println();
        }
        return answer;
    }
}
