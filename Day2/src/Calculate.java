import java.util.Scanner;
public class Calculate {
	//필드값 설정
	private		int num1,num2;
	private		char ch;
	private     double result; 

	public Calculate() {
	}
	public Calculate(int n1,char c,int n2) { //디폴트생성자
		num1 = n1;
		ch = c;
		num2 = n2; 
	}
	//메소드 설정
	public void setNum1(int n) {
		num1 = n; // 실제로는 this.num1 = n; 
	}public void setNum2(int n) {
		num2 = n;
	}public void setCh(char c) {
		ch = c; 
	}

	public int getNum1() {
		return num1; 
	}public int getNum2() {
		return num2;
	}public char getCh() {
		return ch;
	}
	
	public double plus(int n1,int n2) {
		return result = n1+n2; 
	}
	public static void main(String[] args) { //입력 출력 함수
		Scanner sc = new Scanner(System.in);
		//Calculate calc = new Calculate();
		
		int num = sc.nextInt();
		// = calc.setNum1(num);
	    // = calc.setNum1(sc.nextInt());
		char ch = sc.next().charAt(0);
	    // = calc.setCh(ch);
		int num2 = sc.nextInt();
	    // = calc.setNum2(num2);
		
		Calculate calc = new Calculate(num,ch,num2); //생성자 호출
		System.out.print(calc.getNum1()+""+calc.getCh()+""+calc.getNum2()+"=");
		System.out.print(calc.plus(num, num2));
	}
}