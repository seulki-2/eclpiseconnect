//예외처리


import java.util.*;
public class ExceptionExam {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	try{ //예상되는 예외를 인식. 예외예상되는 문장이 안에 들어가있어야함!
	int num = sc.nextInt();
	
		 System.out.println(3/num);
	 }
	 catch(ArithmeticException ae) { //예외처리기. 여러ㅓ개 사용가능
		 ae.printStackTrace(); 
		 System.out.println("0으로 입력하지마세요.");
		 
		 return; // return쓰면 문장 종료. 끝에 Bye는 출력안됨
		 
	 }catch(Exception in) {
		 in.printStackTrace();
		 System.out.println("숫자로 입력해주세요.");
		 
	 }finally { //finally가 있으면 return 을 해도 끝으로 한번 찍고 프로그램종료
		 System.out.println("BYE");
	 }
	System.out.println("BYE");
	}

}
