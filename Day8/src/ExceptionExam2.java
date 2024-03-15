//예외처리

/*
import java.util.*;
public class ExceptionExam2 {

	public static void main(String[] args) throws ArithmeticException{
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	
		 System.out.println(3/num);
		 
		 try {
			Thread.sleep(3000); //3초 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	System.out.println("BYE");
	}

}
*/

//예외처리


import java.util.*;
public class ExceptionExam2 {

	public static void main(String[] args) throws ArithmeticException, InterruptedException{
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	
		 System.out.println(3/num);
	

		Thread.sleep(3000); //3초 일시정지
		
	
	System.out.println("BYE");
	}

}
