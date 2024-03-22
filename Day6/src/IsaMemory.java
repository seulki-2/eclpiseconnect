import java.util.Arrays;
import java.util.Scanner;

public class IsaMemory {

public static void main(String[] args) {
		MyStack ms = new MyStack();
		MyQueue mq = new MyQueue();
		Memory m ;
		int b;
		Scanner sc = new Scanner(System.in);	
		do {
			System.out.print("1.Stack 2.Queue 3.exit");
			int num = sc.nextInt();
			if(num == 1){
				System.out.println("Stack을 선택하였습니다.(FILO)");
				System.out.println("데이터를 넣으실거면 Push, 빼실거면 Pop을 선택해주세요.");
				m=ms;
				System.out.println(Arrays.toString(m.arr));
				System.out.println("=====================================");
			}
			 else if(num==2) {
					System.out.println("Queue를 선택하였습니다.(FIFO)");
					System.out.println("데이터를 넣으실거면 Push, 빼실거면 Pop을 선택해주세요.");
					m=mq;
					System.out.println(Arrays.toString(m.arr));
					System.out.println("=====================================");
					}
			 else {
				 System.out.println("시스템을 종료합니다.");
			     break;
			 }
				while(true) {
					System.out.print("1.push 2.pop 3.back");		
					int n = sc.nextInt();
					if(n == 1) {
						System.out.println("Push 기능을 수행합니다.");
						b = sc.nextInt();
						m.push(b);
						System.out.println("배열은 "+ m.top +"번째 위치입니다.(1부터 시작)");
						System.out.println(Arrays.toString(m.arr));
						System.out.println("=====================================");
					}else if(n == 2) {
						System.out.println("Pop 기능을 수행합니다.");
						m.pop();
						System.out.println(Arrays.toString(m.arr));
						System.out.println("=====================================");
					}else break;
				}
		}while(true);
	}
} 

