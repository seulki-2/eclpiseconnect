import java.util.Scanner;
public class star {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수를 입력하세요: ");
		int num = sc.nextInt();
	 if (num%2!=0)
	      {for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i < (num / 2) + 1) { // 위쪽 삼각형
					if (i + j < (num / 2)) { // 위쪽 왼쪽 빈칸
						System.out.print(" ");
					} else if (j - i >= (num / 2) + 1) { // 위쪽 오른쪽 빈칸
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > (num / 2)) { // 아래쪽 삼각형
					if (i - j >= num / 2 + 1) { // 아래쪽 왼쪽 빈칸
						System.out.print(" ");
					} else if (j + i >= (num / 2) * 3 + 1) { // 아래쪽 오른쪽 빈칸
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
	      }
	   } else {
			System.out.println("홀수가 아니므로 종료합니다.");
		 }
	 
	} 
}
