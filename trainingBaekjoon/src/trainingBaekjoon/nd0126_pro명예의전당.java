package trainingBaekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nd0126_pro명예의전당 {
	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		for(int i : solution(k, score)) System.out.println(i);
	}
	
	public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<score.length; i++) {
	        if(list.size()<k) {
	        	list.add(score[i]);
	        	Collections.sort(list);
	        }else {
	        	if(score[i]>list.get(0)) {
	        		list.set(0, score[i]);
	        		Collections.sort(list);
	        	}
	        }
	        for(int j : list) System.out.print(j+" "); System.out.println();
	        answer[i]=list.get(0);
        }
        return answer;
    }
}
