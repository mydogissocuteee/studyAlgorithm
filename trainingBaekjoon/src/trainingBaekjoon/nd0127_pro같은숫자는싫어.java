package trainingBaekjoon;

import java.util.ArrayList;

public class nd0127_pro같은숫자는싫어 {
	public static void main(String[] args) {
		int[] sizes = {1,1,3,3,0,1,1};
		System.out.println(solution(sizes));
	}
	public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int pin = 10;
        for(int a : arr) {
        	if(a != pin) list.add(a);
        	pin = a;
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
