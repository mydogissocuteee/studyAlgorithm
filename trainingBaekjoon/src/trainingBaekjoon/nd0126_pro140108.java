package trainingBaekjoon;

public class nd0126_pro140108 {
	
	public static void main(String[] args) {
		String s = "banana";
		System.out.print(solution(s));
		System.out.print(solution("abracadabra"));
		System.out.print(solution("aaabbaccccabba"));
	}
	
	public static int solution(String s) {
        int answer = 0;
        int xcnt = 0;
        int cnt = 0;
        
        String x="";
        
        String[] arr = s.split("");
        x = arr[0];
        for(int i=0; i<arr.length; i++) {
        	if(x.equals(arr[i])) xcnt++;
        	else cnt++;
        	
        	if(xcnt==cnt) {
        		answer++;
        		if(i<arr.length-1) x = arr[i+1];
        		
        	}
        }
        if(xcnt!=cnt) answer++;
        return answer;
    }
}
