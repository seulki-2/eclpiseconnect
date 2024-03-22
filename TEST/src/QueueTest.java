
public class QueueTest {


	int []data;
	int front;
	int rear;
	
	public QueueTest() {
		data = new int[5];
		front = rear = 0;
	}
	public void enqueue(int num) {
		
		if( front != 0 && rear == 5)
			shift();
		
		data[rear++] = num;
		 
	}
	public void dequeue() {
		data[front++] = 0;
		
	}
	public void shift() { //시프트 만들기!!!!!
		
	}
	public void disp() {
		
		for(int i:data) {
			System.out.print(i+" , ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		

		QueueTest qe = new QueueTest();
		
		qe.enqueue(1);  qe.disp();
		qe.enqueue(2);  qe.disp();
		qe.enqueue(3);  qe.disp();
		qe.enqueue(4);  qe.disp();
		
		qe.dequeue();   qe.disp();
		qe.dequeue();   qe.disp();
		
		qe.enqueue(5);  qe.disp();
		//shift
	//	qe.enqueue(6);  qe.disp();  // 3,4,5,6
	}

}