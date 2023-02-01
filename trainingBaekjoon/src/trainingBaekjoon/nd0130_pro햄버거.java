package trainingBaekjoon;

public class nd0130_pro햄버거 {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 3, 1};
		System.out.println("결과"+solution(ingredient));
	}
	public static int solution(int[] ingredient) {
        int answer = 0;
        String str = "";
        for(int i=0;i<ingredient.length;i++) {
        	str=str.concat(Integer.toString(ingredient[i]));
        }
        while(true) {
        if(str.contains("1231")) {
        	//System.out.println("ifreplce 전"+str);
        	int len = str.length();
        	str = str.replace("1231", "");
        	int len2 = str.length();
        	//System.out.println("ifreplce 후"+str);
        	//System.out.println((len-len2)/4);
        	answer+=(len-len2)/4;
        }else break;
        }
        return answer;
    }
}
