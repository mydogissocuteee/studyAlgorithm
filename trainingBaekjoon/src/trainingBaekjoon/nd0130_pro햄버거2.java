package trainingBaekjoon;

import java.util.ArrayList;

public class nd0130_pro햄버거2 {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 3, 1};
		System.out.println("결과"+solution(ingredient));
	}
	public static int solution(int[] ingredient) {
		int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ingredient.length;i++) {
        	list.add(ingredient[i]);
        	
        	if(list.size()>3&& //4라고 해서 틀림
        			list.get(list.size()-1)==1 &&
        			list.get(list.size()-2)==3 &&
        			list.get(list.size()-3)==2 &&
        			list.get(list.size()-4)==1) {
        		answer++;
        		for(int j=0;j<4;j++) {
        			list.remove(list.size()-1);
        		}
        	}
        }
        return answer;
    }
}
