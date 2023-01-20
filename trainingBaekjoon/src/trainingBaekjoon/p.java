package trainingBaekjoon;

public class p {

	public int[] solution(String today, String[] terms, String[] privacies) {
		// today 오늘 날짜
		// terms 등급 별 기간
		// privacies 는 등록날짜와 등급 공백으로 구분
		
		// privacies 에서 등급 부터 구별 하고 if 문에 terms 넣어서 언제까지인지 구별하여 새 배열에 넣기
		String answerS = "";
		
		int thisyear = Integer.parseInt(today.split(".")[0]);
		int thismonth = Integer.parseInt(today.split(".")[1]);
		int thisday = Integer.parseInt(today.split(".")[2]);
		
		// 오늘 날짜
		int todays = thisyear*12*28 + thismonth*28 + thisday;
		
		// 오늘 날짜와 비교해서 지났는지 아닌지 결정 지났으면 answer에 추가
		
		for (int i = 0; i<privacies.length; i++) {
			String grade = privacies[i].split(" ")[1]; // privacies[i]의 등급
			
			
			
			// privacies[i]의 날짜
			int pyear = Integer.parseInt(privacies[i].split(".")[0]);
			int pmonth = Integer.parseInt(privacies[i].split(".")[1]);
			int pday = Integer.parseInt(privacies[i].split(".")[2].split(" ")[0]);
			
			int pridays = pyear*12*28 + pmonth*28 + pday;

			for (int j = 0; j<terms.length; i++) { //terms 반복문 돌기
				if(grade.equals(terms[j].split(" ")[0])) { //terms에 grade와 같은 문자 찾아내기
					pridays += (Integer.parseInt(terms[j].split(" ")[1])*28-1);
				}
			}
			
			if (pridays<todays) answerS += i+1;
		}
		String[] answerString = answerS.split("");
		int[] answer = new int[answerString.length];
        for (int i = 0; i < answerString.length; i++) {
        	answer[i] = Integer.parseInt(answerString[i]);
        }
		
		
        return answer;
    }
	
}
