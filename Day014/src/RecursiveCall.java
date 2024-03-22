/*
import java.util.Scanner;
public class RecursiveCall {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("팩토리얼 수를 입력해주세요.");
	int factorial= sc.nextInt();
		int result = 0;
		for(int n=(factorial-1); n>0; n--) {
			if(n==0) {
				return;}
		 result = factorial*=n;
		
		} System.out.println(result);
	}
}
*/

import java.util.Scanner;

public class RecursiveCall {
	static int result;
	static int factorial;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("팩토리얼 수를 입력해주세요.");
		factorial = sc.nextInt();

		System.out.println(fact(factorial));
	}

	public static int fact(int n) {
		if (n <= 1)
			return n;
		else
			return fact(n - 1) * n;
	}
}
