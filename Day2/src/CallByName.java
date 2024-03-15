//입력, 연산, 출력 
/*
public class CallByName {
	public static void main(String []args){
		
		CallByName.disp2();
		
		CallByName cbn = new CallByName();
		
		cbn.disp1();
		cbn.disp2();
		
		int num = 100;
		
		num = cbn.disp3(num);
		System.out.println(num);
		
		
		String str = new String("Suberman");
		//System.out.println(str);
		
	    cbn.disp4(str);
	}
	
	public void disp4(String s) {
		System.out.println(s);
	}
		
	public int disp3(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
	
		return num;
	}
	
	
	public void disp1() {// call by name
		System.out.println("Call by name1");
	}


	public static void disp2() { // call by name
		System.out.println("Call by name2");
}
}
*/
/*
import java.util.*;
public class CallByName {
    
    static int add (int input1, int input2) //더하기 메소드
    {
    	return input1+input2;
    }
    static int minus (int input1, int input2) //빼기 메소드
    {
        return input1-input2;
    }
    static int multi (int input1, int input2) //곱하기 메소드
    {
        return input1*input2;
    }
    static float divide (float input1, float input2) //나누기 메소드
    {
        return input1/input2;
     }
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력: ");
        int input1=scan.nextInt();
       
        System.out.print("연산자 입력(+,-,*,/):");
        String op=scan.next();
       
        System.out.print("두 번째 숫자 입력: ");
        int input2=scan.nextInt();

        int result=0;
        
        //메소드 호출
        switch(op)
        {
        case "+":
            System.out.printf(input1+""+op+""+input2+"="+(input1+input2));
            break;
        case "-":
            System.out.printf(input1+""+op+""+input2+"="+(input1-input2));
            break;
        case "*":
            System.out.printf(input1+""+op+""+input2+"="+(input1*input2));
            break;
        case "/":
            System.out.printf(input1+""+op+""+input2+"="+((double)input1/input2));
            break;
        default:
            System.out.println("잘못된 연산자입니다.");
            return; 
        }          
    }   
}
*/
//메서드 6개 / if else if 
//print 
//입력 함수 숫자 2개 받고 Input
//연산 +,-,/,* 4개로 나누기 나누기만 float/int / add, minus, multi, divide
//출력 Output println


import java.util.Scanner;
public class CallByName {

	public static void main(String[] args) {

		char Again;
		do {
			Scanner sc = new Scanner(System.in);

			int num1 = input1(sc);
			char cal = input2(sc);
			int num2 = input3(sc);

			double result = calculator(num1, cal, num2);

			System.out.println(output(num1, cal, num2, result)); 
			System.out.println("다시 할까요?");

			Again = sc.next().charAt(0);

		} while ((Again == 'y')||(Again == 'Y')); //반복여부 의사 체크
	}

	public static int input1(Scanner sc) {
		System.out.println("첫 번째 수를 입력하세요");
		int num1 = sc.nextInt();
		return num1;
	}

	public static char input2(Scanner sc) {
		System.out.println("연산자를 입력하세요");
		char cal = sc.next().charAt(0);
		return cal;
	}

	public static int input3(Scanner sc) {
		System.out.println("두 번째 수를 입력하세요");
		int num1 = sc.nextInt();
		return num1;
	}
	public static double calculator(int num1, char cal, int num2) {
		double result = 0;
		if (cal == '+') {
			result = num1 + num2;
		} else if (cal == '-') {
			result = num1 - num2;
		} else if (cal == '*') {
			result = num1 * num2;
		} else {
			result =(double)num1 / num2;
		}
		return result;
	}
	
	public static String output(int num1, char cal, int num2, double result)
	{
		return(num1 + "" + cal + "" + num2 + "=" + result);
	}
}