import java.util.*;

public class ExceptionHw {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try {	
		int[] arr = {1, 2, 3};
		System.out.print("인덱스를 입력하세요: ");
		int index = sc.nextInt();
		
		System.out.println("인덱스 위치에 어떤 숫자가 있나요? " + arr[index]);
		
	  } catch(InputMismatchException S) {
		System.out.println("정수로만 입력해주세요.");
	    System.out.println("오류내용은 하단과 같습니다.");
	    S.printStackTrace();
	    return;
	  } catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 인덱스 범위를 벗어났습니다.");
		System.out.println("오류내용은 하단과 같습니다.");
		e.printStackTrace();
		return;
	  }
	  System.out.println("종료되었습니다.");
}
}
/*
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Case 1: ArithmeticException 발생
        try {
            int result = divide(10, 0); // 0으로 나누기 예외 발생
            System.out.println("결과: " + result); // 실행되지 않음
        } catch (ArithmeticException e) {
            System.out.println("Case 1: 0으로 나눌 수 없습니다.");
        }

        // Case 2: ArrayIndexOutOfBoundsException 발생
        try {
            int[] arr = {1, 2, 3};
            System.out.println("배열의 4번째 요소: " + arr[3]); // 존재하지 않는 인덱스 접근
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Case 2: 배열의 범위를 벗어났습니다.");
        }
    }

    // 두 수를 나누는 메서드
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
*/