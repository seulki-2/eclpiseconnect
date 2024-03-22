import java.util.Scanner;

public class RecursivePb {

	static int result;
	static int fibonacci;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피보나추 수열의 몇번째 항을 볼까요?");
		fibonacci = sc.nextInt();

		for(int i=(fibonacci-1); i>0; i--) {
		System.out.print(fibo(fibonacci-i+1) + " ");
		}
	}

	public static int fibo(int n) {
		if (n == 1) {
			return 0;}
		 if(n == 2) {
			return 1;}
		return fibo(n-1)+fibo(n-2);
	}
}
