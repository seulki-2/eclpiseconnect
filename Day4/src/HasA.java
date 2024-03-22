class A{ //클래스
	private int save; //필드 
	
	public A() { //const
		System.out.println("A");
	}
	public void setA(int a) { this.save = a; }
	public int getA() { return save; }
}

public class HasA { //숫자만 A를 연동

	
	private String name;
	private A age; 
	
	public HasA() { //생성자
		System.out.println("HasA");
		name =""; 
		age = new A(); 
	}
	
	
	
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age.setA(age); } //this.age = age; }
	                              // this.age.a = age; 
	public String getName() { return name; }
	public int getAge() { return this.age.getA(); }
	
	
	
	
	public static void main(String[] args) { //메인함수
		
		HasA has = new HasA(); 
		A a = new A();
		
		has.setName("Superman");
		has.setAge(100000);
		a.setA(5);
		
		System.out.println(has.getName());
		System.out.println(has.getAge());
		System.out.println(a.getA());
		
	}

}