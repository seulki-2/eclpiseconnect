import java.util.Scanner;
public class Star {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Star.choosestar(sc);
	}
		public static void choosestar(Scanner sc) {
			System.out.print("몇 번의 별모양을 출력할까요? : ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				tree();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six(sc);
				break;
			}
			;
		}
		
		public static void one() {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				System.out.print("*");
				}
				System.out.println();
				
				}
		}
		public static void two() {
			for(int i=0;i<3;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
				
				}
		}
		
		public static void tree() {
			for (int i = 1; i < 4; i++) {
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			    } 
		}
		public static void four() {
			for (int i = 1; i < 4; i++) {
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			    } 
		}
		public static void five() {
			for (int i = 1; i < 4; i++) {
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i < 3; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 2; j >= i; j--) {
					System.out.print("*");
				}
				for (int k = 2; k > i; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		public static void six(Scanner sc) {

		System.out.print("홀수를 입력하세요: ");
		int num = sc.nextInt();
	 if (num%2!=0)
	      {for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {

				if (i<(num/2)+1) { 
					if (i+j<(num/2)) { 
						System.out.print(" ");
					} else if (j-i>=(num/2)+1) { 
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i>(num/2)) { 
					if (i-j>= num/2+1) { 
						System.out.print(" ");
					} else if (j+i>=(num /2)*3+1) {
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
