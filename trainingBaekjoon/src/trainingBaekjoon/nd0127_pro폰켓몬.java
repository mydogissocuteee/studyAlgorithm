package trainingBaekjoon;

import java.util.HashSet;
import java.util.Set;

public class nd0127_pro폰켓몬 {
	public static void main(String[] args) {
		int[] sizes = {3,3,3,2,2,2};
		System.out.println(solution(sizes));
	}
	public static int solution(int[] nums) {
	        int answer = 0;
	        Set<Integer> set = new HashSet<>();
	        
	        for(int i=0;i<nums.length;i++) {
	        		set.add(nums[i]);
	        }
	        if (nums.length/2<set.size()) answer=nums.length/2;
	        else answer = set.size();
	        return answer;
	    }
}
