/* Inner Class
 * 
public class InnerClassExam01 { 
	
	private int a;
	private static int b;
	
	
	class Test{ //inner class 
		public void disp() {
			System.out.println(a);
			System.out.println(b);
		}
		
	}
	public static void main(String[] args) {
//		InnerClassExam01 inner = new InnerClassExam01();
//		InnerClassExam01.Test test = inner.new Test();
		
		InnerClassExam01.Test test = new InnerClassExam01().new Test(); // 위 두 줄 합친것!
		
		test.disp();
	}
}
*/
///////////////////////////////////////////////////////////
/* Static Class

public class InnerClassExam01 { 
	
	//private int a;
	private static int b;
	
	
	static class Test{ //inner class 
		public void disp() {
		//	System.out.println(a); //a는 static이 아니라 static class 안에 못넣음!. 번거로워서 잘 안씀.
			System.out.println(b); 
		}
		
	}
	public static void main(String[] args) {
//		InnerClassExam01 inner = new InnerClassExam01();
//		InnerClassExam01.Test test = inner.new Test();
		
		InnerClassExam01.Test test = new InnerClassExam01().new Test(); // 위 두 줄 합친것!
		
		test.disp();
	}
}

*/
////////////////////////////////
/*
//local inner class


public class InnerClassExam01 { 
	
	private int a;
	private static int b;
	
	public void dispTest() {
		
	class Test{ //inner class 
		public void disp() {
			
			System.out.println(a);
			System.out.println(b);
		}
	 }
	Test test = new Test();
	test.disp();
   }
	
	
	public static void main(String[] args) {
//		InnerClassExam01 inner = new InnerClassExam01();
//		InnerClassExam01.Test test = inner.new Test();
		
		InnerClassExam01 inner = new InnerClassExam01(); // 위 두 줄 합친것!
		
		inner.dispTest();
	}
}
*/
////////////////////////////////////////////////////////////////////////////////
/*
//Anonymous Inner Class


public class InnerClassExam01 { 
	
	
	private int a;
	public void dispInter() {
		new AAA() {
			
			@Override
			public void disp1() {
				System.out.println(a);
				
			}

			@Override
			public void disp() {
				System.out.println(a);
			}
		}.disp();
	}
	
	public static void main(String[] args) {
		InnerClassExam01 inter = new InnerClassExam01();
	  inter.dispInter();
	}
}

*/

import java.awt.*;
class InnerClassExam01{
	public static void main(String[] args) {
		Button b = new Button("START");
		b.addActionListener(new eventHandler());
	}
}

class EventHandler implements ActionListener{
	public void actionperformed(ActionEvent e) {
		System.out.println("ActionEvent Occurred!");
	}
}