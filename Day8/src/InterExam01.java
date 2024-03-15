
public class InterExam01 implements CCC {
	int a = 10;
	public static void main(String[] args) {
		
		// InterExam01 inter = new InterExam01(); 정적바인딩
		
		CCC inter = new InterExam01(); 
		
		inter.disp(); //동적바인딩
		inter.disp1();
		inter.disp2();
		// inter.disp3(); //에러. 동적바인딩 시 위치에서 알고있는 것까지만 접근가능!!. 정적바인딩 사용하면 가능.
		
		
	}
	@Override
	public void disp1() {
		System.out.println("Disp");
		
	}
	public void disp2(){
		System.out.println("Disp2");
		
	}
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
