public class SortExam {

	static int exc = 0;
	static int tr = 0;
	
	public static void main(String[] args) {
		int data[] = { 90, 78, 100, 30, 55 };
		bubbleSort(data);
		for (int i : data) {
			System.out.println(i + "\t");
		}
		System.out.println("총 try 횟수: " + tr);
		System.out.println("총 바꾼 횟수: " + exc);
	}
	public static void bubbleSort(int[] data) { //버블소트 진행
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = data.length - 1; j > i; j--) {
				if (data[j - 1] > data[j]) {
					swap(data, j - 1, j);
					exc++;
				}
				tr++;
			}if (exc ==0) break;
		}
	}
	static void swap(int[] data, int a, int b) { //숫자교환
		int tem = data[a];
		data[a] = data[b];
		data[b] = tem;
	}
}
