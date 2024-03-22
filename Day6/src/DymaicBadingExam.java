class Halbe {
	public void disp() {
		System.out.println("Halbe");
	}
}

class Abe extends Halbe {
	public void disp() {
		System.out.println("Abe");
	}

	public void dispAbe() {
		System.out.println("disAbe");
	}
}

class Me extends Abe {
	public void disp() {
		System.out.println("Me");
	}
	public void dispMe() {
		System.out.println("disMe");
	}
}

public class DymaicBadingExam {

	public static void main(String[] args) {
		Me me = new Me();  //=================정적바인딩
		me.disp();
		Abe abe = new Abe();
		abe.disp();
		Halbe halbe = new Halbe();
		halbe.disp();
		
		
		halbe = abe; //=============동적바인딩
		halbe.disp();
		
		halbe = me;
		halbe.disp();
		
//		halbe.dispMe(); //에러발생. Me가 갖고 있는 모든것은 사용불가. 내가 알고 있는 disp만 가능!!
	}
}
