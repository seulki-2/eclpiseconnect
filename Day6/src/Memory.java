public abstract class Memory {

	protected int []arr;
	protected int top;
	protected int front=0;
	
	public Memory() {
		arr = new int[5];
		top = 0;
	}

	public void push(int data) {
		//arr[top++] = data;
		if (top==5)
		{System.out.println("배열이 가득 찼습니다.");
		}else {arr[top++] = data;}
	}
	
	public abstract void pop();
	
}