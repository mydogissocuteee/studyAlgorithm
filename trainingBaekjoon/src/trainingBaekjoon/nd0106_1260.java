package trainingBaekjoon;

import java.util.Scanner;

public class nd0106_1260 {

	static int nn; //노드 수
	static int mm; //간선 수
	static int vv; //시작 정점 
	static int[][] graph;
	static boolean[] checked; //확인 여부
	
	public static void dfs(int i) {
		checked[i] = true;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		nn = in.nextInt();
		mm = in.nextInt();
		vv = in.nextInt();
		graph = new int[nn+1][nn+1];
		
		
		for (int i =0;i<mm;i++) {
			int fromn = in.nextInt();
			int ton = in.nextInt();
			
			graph[fromn][ton] = graph[ton][fromn] = 1;
		}
		
		
		for (int i =1;i<=nn;i++) {
			for (int j =1;j<=nn;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
				
		}

	}

}
