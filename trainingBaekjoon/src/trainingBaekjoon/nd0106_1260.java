package trainingBaekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class nd0106_1260 {

	static int nn; //노드 수
	static int mm; //간선 수
	static int vv; //시작 정점 
	static int[][] graph; //간선 연결 상태
	static boolean[] checked; //확인 여부
	
	public static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
	    
	    for(int j = 1; j <= nn; j++) {
	      if(graph[i][j] == 1 && checked[j] == false) {
	        dfs(j);
	      }
	    }
	}
	
	public static void bfs() {
	    Queue<Integer> queue = new LinkedList<Integer>();
	    queue.offer(vv); //시작점도 Queue에 넣어야 함
	    checked[vv] = true;
	    System.out.print(vv + " ");
	    
	    //Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
	    while(!queue.isEmpty()) {
	      int temp = queue.poll();
	      
	      for(int j = 1; j <= nn; j++) {
	        if(graph[temp][j] == 1 && checked[j] == false) {
	          queue.offer(j);
	          checked[j] = true;
	          System.out.print(j + " ");
	        }
	      }
	    }
	  }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		nn = in.nextInt();
		mm = in.nextInt();
		vv = in.nextInt();
		graph = new int[nn+1][nn+1];
		checked = new boolean[nn+1];
		
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
		
		  dfs(vv); //dfs호출
		  
		  checked = new boolean[1001]; //확인상태 초기화
		  System.out.println(); //줄바꿈
		  
		  bfs(); //bfs호출

	}

}
