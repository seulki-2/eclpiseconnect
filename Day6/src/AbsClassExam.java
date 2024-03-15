abstract class Area{
	public abstract void draw(); // 추상메소드
}
//class Rect extends Area{ //상속은 받았지만 오버라이딩을 안해서 오류. 오류수정을 위해서는 추상화가 되거나~ method를 오버라이딩하거나~
//	
//}

class Rect extends Area{ //상속은 받았지만 오버라이딩을 안해서 오류. 오류수정을 위해서는 추상화가 되거나~ method를 오버라이딩하거나~
	public void draw() {
	  System.out.println("Rect");
	}
}

class Circle extends Area{
	public void draw() {
		  System.out.println("Circle");
	}
}

class Tri extends Area{
	@Override //오버라이딩이라고 명시적으로 기능 적어두면 나중에 편함
	public void draw() {
		  System.out.println("Tri");
	}
}

public class AbsClassExam {

	public static void main(String[] args) {

	Tri tri = new Tri();
	tri.draw();
	
	Rect rect = new Rect();
	rect.draw();
	
	Circle cir = new Circle();
	cir.draw();
	}
}
