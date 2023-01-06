package trainingBaekjoon;

public class nd0105_dfs {
	int[] numbers;
	int target;
	int answer;
	
	void dfs (int index, int sum) {
		
		if( index == answer) {
			if(sum == target) answer++;
			return;
		}
		dfs(index +1 , sum + numbers[index]);
		dfs(index +1 , sum - numbers[index]);
	}
	
	public static void main(String[] args) {
		 

	}

}
