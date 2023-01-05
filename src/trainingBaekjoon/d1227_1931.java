package trainingBaekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class d1227_1931 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int[][] arr = new int[nn][2];
		for (int i =0;i<nn;i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}

		Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) { //종료시간이 같을 경우 시작 시간이 빠른 순
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
		
		int cnt = 0;
		int time = 0;
		
		for (int i =0;i<nn;i++) {
			if(time<=arr[i][0]) {
				time=arr[i][1];
				cnt++;
			}
		}
		for(int i =0;i<nn;i++) System.out.println(arr[i][0]+" "+arr[i][1]);
		 System.out.println(cnt);
	}

}
