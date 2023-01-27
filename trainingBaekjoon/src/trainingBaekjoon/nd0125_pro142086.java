package trainingBaekjoon;

import java.util.HashMap;
import java.util.Map;

public class nd0125_pro142086 {

	public static void main(String[] args) {
		String s = "banana";
		for(int i : solution(s)) {
			System.out.print(i+" ");
		}
		System.out.println();
		String s1 = "foobar";
		for(int i : solution(s1)) {
			System.out.print(i+" ");
		}
		
	}
    public static int[] solution(String s) {
    	int[] answer = new int[s.length()];
    	
    	Map<String, Integer> indexMap = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		if(!indexMap.containsKey(s.substring(i,i+1))) { // 없으면
    			answer[i] = -1;
    		}else {
    			answer[i] = i-indexMap.get(s.substring(i,i+1));
    		}
    		indexMap.put(s.substring(i,i+1), i); // 존재X라면 새로 등록, 존재한다면 수정
    	}
    	
        return answer;
    }
}
