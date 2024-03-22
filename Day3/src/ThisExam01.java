/*
 * 
 * this: 자기자신을 접근하는 객체 레퍼런스 변수
 * 인스턴스 메소드 첫번째 매개변수로 항상 존재
 * 선언불가. 사용만 가능
 * 
 * 
 */
public class ThisExam01 {
	 int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a; //필드 this
	}
	public static void main(String[] args) {
		
 
	}

}
