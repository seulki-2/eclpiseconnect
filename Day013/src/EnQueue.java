public class EnQueue {

	int []data;
	int front;
	int rear;
	
	public EnQueue() {
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
	public void shift() {
		int i;
		int num = rear - front;
		for(i =0; i<num; i++) {
			data[i] = data[front];
			data[front++] = 0;
		}
		front = 00;
		rear = i;
		}
	
	public void disp() {
		
		for(int i:data) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		

		EnQueue qe = new EnQueue();
		//shift i = new shift();
		
		qe.enqueue(1);  qe.disp();
		qe.enqueue(2);  qe.disp();
		qe.enqueue(3);  qe.disp();
		qe.enqueue(4);  qe.disp();
		
		qe.dequeue();   qe.disp();
		qe.dequeue();   qe.disp();
		
		qe.enqueue(5);  qe.disp();
	//	qe.shift();
	//	qe.enqueue(6);  qe.disp();  // 3,4,5,6
	}
}