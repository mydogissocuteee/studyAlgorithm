package trainingBaekjoon;

public class nd0221 {
public static void main(String[] args) {
	int[][] arr ={{1,2,3}, {4,5,6}, {7,8}, {9,10,11,12}};
	int answer=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			answer+=arr[i][j];
		}
	}
	System.out.println(answer);
	
	String str ="aa:bb:cc:dd";
	String[] arr2 = str.split(":");
	for(String stri : arr2) System.out.println(stri);
}
}
