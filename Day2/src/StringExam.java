
public class StringExam {
	public static void main(String[] args)
	{
		
		String str1 = new String("Superman");
		String str2 = new String("Superman");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1==str2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Differ");
		}
		
		if (str1.equals(str2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Differ");
		}
		
		
	}
}
