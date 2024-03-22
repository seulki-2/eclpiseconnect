

class A{  // A는 Object 상속!
	public A() {
		//super(); 가 숨어져있음. sub클래스 첫번째란에 숨겨져있음
		System.out.println("Super class");
		}

	public void disp() {
		System.out.println("A...");
	}
	

    public String toString() {
	return super.toString()+"Superman";
	}
}

public class IsAExam01 extends A {

	public IsAExam01() {
		//부모의 생성자를 호출
		//super();
		System.out.println("sub class");
	}
	
	//public String toString() {
	//	return super.toString()+"Superman";
	//}
	
	
	public static void main(String[] args) { //
	
		IsAExam01 isa = new IsAExam01(); //생성자 호출
		System.out.println(isa);
		System.out.println(isa.toString()); //7열과 동일함. reference변수를 출력한다 = reference변수.toString / toString = Object에 있음. Object 직접적 상속안받아도, A가 object 상속되어잇으므로 사용 가능
		
		isa.disp();
   }
}

