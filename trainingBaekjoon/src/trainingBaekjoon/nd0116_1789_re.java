package trainingBaekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class nd0116_1789_re {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	BigInteger s = in.nextBigInteger();
	BigInteger plus = new BigInteger("1");
	BigInteger sum = new BigInteger("0");
	
	while(true) {
		sum = sum.add(plus);
		if(sum.compareTo(s) == 1) break;
		plus = plus.add(BigInteger.valueOf(1));
	}
	
	System.out.println(plus.subtract(BigInteger.ONE));
}
}
