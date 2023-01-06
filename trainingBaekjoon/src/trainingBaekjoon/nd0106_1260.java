package trainingBaekjoon;

import java.util.Scanner;

public class nd0106_1260 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int mm = in.nextInt();
		int vv = in.nextInt();
		int[][] graph = new int[nn][nn];
		
		for (int i =0;i<vv;i++) {
			int fromn = in.nextInt();
			int ton = in.nextInt();
			
			graph[fromn][ton] = 1;
			graph[ton][fromn] = 1;
		}
		
		for (int i =0;i<vv;i++) {
			for (int j =0;j<vv;j++) {
				System.out.print(graph[i][j]+" ");
				System.out.println();
			}
				
		}

	}

}
