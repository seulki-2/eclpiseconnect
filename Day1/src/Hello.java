
/* JAVA는 100% 상속구조
 * 100% 객체지향언어이다 > 무조건 객체를 사용 > class
 * 
 * 시작과 끝을 담당하는 함수 = main함수
 * 함수 = function = method
 * 
 * default = 같은 패키지만 사용할 수 있음
 * private = 다른사람 사용 불가 
 * public = 모두 사용 가능 
 * protect = 외부패키지 중 상속받은 사람만 가능 
 */

//패키지 / 임포트 올 수 잇음.
//import java.lang.*;
/*	 System.out.println("hello..");		
		//dataype 변수명;
	    //변수명 = 값; ==초기화

	int num;
	num = 10;
	char ch = 'A';
	System.out.println(num); 
	System.out.println(ch); 
	
	Hello hello;
	hello = new 
	
	*/


import java.util.Scanner;
public class Hello {

	public static void main(String []args){ //프로그램을 시작하고 끝내줌. 

		System.out.println("홀수 입력:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=0;i<num;i++){
		  for (int j=0;j<num;j++)
		  {
		     if (i<=num/2)// 위쪽 영역
		     {
		        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *찍기
		     }
		     else if (i>num/2) //아래쪽 영역
		     {
		        if (i-j>=num/2+1) //왼쪽 밑 공백
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *찍기
		     }
		  }
		  System.out.println();//줄바꿈
		}

}
}