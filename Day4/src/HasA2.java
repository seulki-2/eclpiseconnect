

public class HasA2 { //외부에서 만든 객체를 넣는 것_객체di
	private AA aa;
	private BB bb;
	private CC cc;
	
	public HasA2() { //생성자
		
		aa = new AA(); 
		bb = new BB();
		cc = new CC();
	}
	
//	public void setAa(AA aa, BB bb, CC cc) {
//		this.aa=aa;
//		this.bb=bb;
//		this.cc=cc;
//	}
	
	public void setAa(String a,int b,int c) {
		this.aa.setAa(a);
		this.bb.setAa(b);
		this.cc.setAa(c);
	}
	
	public String getA() {
		return aa.getAa();
	}
	
	public int getB() {
		return bb.getAa();
	}
	
	public int getC() {
		return cc.getAa();
	}

	public static void main(String[] args) {
		 HasA2 hasa2 = new HasA2();
		AA aa = new AA();
		BB bb = new BB();
		CC cc = new CC();
		 aa.setAa("tt");
			System.out.println(aa.getAa());
			System.out.println(bb.getAa());
			System.out.println(cc.getAa());
		
		hasa2.setAa("5",1,2);

		
		System.out.println(hasa2.getA());
		System.out.println(hasa2.getB());
		System.out.println(hasa2.getC());
		
	//	System.out.println(hasa2.getAA());
}
}