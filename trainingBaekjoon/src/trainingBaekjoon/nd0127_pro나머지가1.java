package trainingBaekjoon;

public class nd0127_pro나머지가1 {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
	}
	public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<n;i++) {
        	if(n%i==1) {
        		answer=i;
        		break;
        	}
        }
        return answer;
    }
}
