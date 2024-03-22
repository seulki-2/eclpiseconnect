import java.util.Scanner;
public class JungDon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0; int y = 0;

		System.out.println("Input X Number : ");
		x = sc.nextInt();
		System.out.println("Input Y Number : ");
		y = sc.nextInt();

		if (x < 100 || x > 9999999 || y < x || y > 9999999) {
			System.out.println("잘못된 숫자를 입력했습니다.");
			System.out.println("X는 100~9,999,999사이로 입력, Y는 X~9,999,999로 입력해주세요.");
			return;
		}orderNum(x, y);}

	public static void orderNum(int a, int b) { // x~y 까지의 정돈된 수를 출력
		int count = 0;

		for (int i = a; i < b; i++) {
			if (order(i)) {
				System.out.print(i + " ");
				count++;}
		}
		System.out.println("Count : " + count);
		}
	 public static boolean order(int a) { 	// 정돈된 수인지 확인하는 메서드
		String str = String.valueOf(a);
		boolean result = true;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) >= str.charAt(i + 1)) {
				result = false;
				break;}}
		return result;}
}
