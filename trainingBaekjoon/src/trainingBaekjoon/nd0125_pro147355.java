package trainingBaekjoon;

public class nd0125_pro147355 {
	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		
		System.out.println(solution(t, p));
	}
	public static int solution(String t, String p) {
        int answer = 0;

        int times = t.length()-p.length()+1; // 반복문 횟수
        int len = p.length(); // 잘라올 문자열의 인덱스
        
        for(int i =0;i<times;i++) {
        	Long tint = Long.parseLong(t.substring(i,i+len));
        	Long pint = Long.parseLong(p);
        	System.out.println(tint+" "+ pint);
        	
        	if(tint<=pint) answer++;
        }
        
        return answer;
        
    }
}
