
public class ClassExam01 {

	//field
	private int a;
	
	//constructor
	public ClassExam01() { // <=디폴트 생성자
		System.out.println("디폴트생산자");
	}
	
	public ClassExam01(int aa) { // <=디폴트 생성자
		a = aa;
	}2
	//method : setter 메소드, getter
	public void setA(int num) {
		a=num;
    }
	public int getA(){
		return a;
	}
	
	
	public static void main(String[] args) {
		
		ClassExam01 ce1 = new ClassExam01(); //생성자 호출. 디폴트 생성자(8행)
		ClassExam01 ce2 = new ClassExam01(10); //생성자 호출. 디폴트 생성자(12행)
		ClassExam01 ce3 = new ClassExam01(657); //생성자 호출. 디폴트 생성자(12행)
		
		System.out.println(ce1.a);
		System.out.println(ce2.a);
		System.out.println(ce3.a);
	}

}
