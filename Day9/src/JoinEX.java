
public class JoinEX implements Runnable{
	private int[] temp;
	String threadname;
	
	public JoinEX(String threadname) {
	this.threadname = threadname;
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for(int start:temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드 이름 : %s," , Thread.currentThread().getName());
			System.out.printf("temp value : %d %n",start);
			}
		first();
		}

   public void first() {
	  System.out.println("first"); 
	  second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Start");
		JoinEX st = new JoinEX(null);
		Thread t = new Thread(st,"superman");
		t.start();
		try {
			t.join();
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
		}
}
