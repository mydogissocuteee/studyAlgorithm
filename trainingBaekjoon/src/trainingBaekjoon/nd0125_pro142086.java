package trainingBaekjoon;

public class nd0125_pro142086 {

	public static void main(String[] args) {
		String s = "banana";
		System.out.println(solution(s));
	}
    public static int[] solution(String s) {
    	
    	String check ="";
    	for(int i=0;i<s.length();i++) {
    		check = check.concat(s.substring(i,i+1));
    		System.out.println(check);
    	}
    	
        int[] answer = {};
        return answer;
    }
}
