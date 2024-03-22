import java.util.Random;
public class InsertionSortExam {
    static int count;
    static int tr;
    
    public static void main(String[] args) {
        int data[] = new int[1000];
        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            data[i] = random.nextInt(1000);}
        
        insertion(data, 1000);
        
        for (int i = 0; i < 999; i++) {
            if (data[i] > data[i + 1]) {
                System.out.println("ERROR");}
            System.out.println(data[i]);}
        System.out.println("총 교환 횟수: " + count);
        System.out.println("총 try 횟수: " + tr);}
    
    static void insertion(int[] data, int n) {
        for(int i = 1; i < n; i++) {
            int j, temp = data[i];
            for(j = i; j > 0 && data[j - 1] > temp; j--) {
                data[j] = data[j - 1];
                count++; // 교환 횟수 증가
            }
            data[j] = temp;
            tr++; // try 횟수 증가
        }
    }
}



/*
import java.util.Random;

public class InsertionSortExam {

	static int count;
	static int tr;
	
	static void insertion(int[] data, int n) {
		for(int i=1; i<n; i++) {
			int j; int tem =data[i];
			for(j = i; j>0 && data[j-1]>tem; j--) {
				data[j]=data[j-1];
				data[j]=tem;
				count++;
			}tr++;
		}
	}
	
	public static void main(String[] args) {

	int data[] = new int[10];
	Random random = new Random();
	
	for (int i =0; i<10; i++) {
		data[i] = random.nextInt(10);
	}
	insertion(data, 10);
	for(int i = 0; i<=8; i++)
	{
		if(data[i]>data[i+1])
			System.out.println("ERROR");
		System.out.println(data[i]);

	}
	System.out.println("총 교환 홧수: " +count);
	System.out.println("총 try 횟수: " +tr);
	}

}
*/