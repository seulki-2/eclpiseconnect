/*
class AA{
	private int a; // private을 붙이면 cc.a = 사용불가
	
	public int getA() {
        return a;
	}
}  


class BB extends AA{
	private int b;
}

class CC extends BB{
	
	private int c;
	
}

public class SuperExam01 {
	
	public static void main(String[] args) {
		
		CC cc = new CC();
		//cc.a = 10;

		System.out.println(cc.getA());
        System.out.println(cc.getB());
        System.out.println(cc.getC());

	}
} //에러 고치기 문제
*/


class AA{
	private int a; // private을 붙이면 cc.a = 사용불가
	
	public AA(int a) {
		this.a=a;
	}
	
	public int getA() {return a;}


class BB extends AA{
	private int b;
	
	public BB(int a,int b) {
		super(a);
		this.b = b;
	}
	public int getB() {return b;}
}

class CC extends BB{
	
	private int c;

	public CC(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	public int getC() {return c;}
}

public class SuperExam01 {
	
	public static void main(String[] args) {
		
		CC cc = new CC(10,20,30);
		//cc.a = 10;

		System.out.println(cc.getA());
        System.out.println(cc.getB());
        System.out.println(cc.getC());

	}
}
