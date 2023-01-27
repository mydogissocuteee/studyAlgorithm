package trainingBaekjoon;

public class nd0127_pro숫자문자열과영단어 {
	public static void main(String[] args) {
		String s = "one4seveneight";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<10;i++) {
        	s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
	}
	
}
