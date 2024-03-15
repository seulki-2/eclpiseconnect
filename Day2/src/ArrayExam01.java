import java.util.Scanner;

public class ArrayExam01 {
    public static void main(String[] args) {
        
    	int stu=studentN0(); //학생수 입력 함수
    	arrayGenerator(stu); //학생 성적 함수
    }
	public static int studentN0() { //학생수 입력 함수
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
        return sc.nextInt();
	}
	public static void arrayGenerator(int stu) { //학생 성적 함수
    	Scanner sc = new Scanner(System.in);
        String[] name = new String[stu];
        int[][] score = new int[stu][4]; // 총점을 저장할 공간이 필요하므로 [4]
        float[] avg = new float[stu];
        String []scoName = {"이름","국어","영어","수학","총점","평균"};

        // 학생 이름 및 점수 입력
        for (int j = 0; j < stu; j++) {
            System.out.println("이름을 입력하세요");
            name[j] = sc.next(); // 이름 입력
            System.out.println(sconame[j+1]+" 점수를 입력해주세요.");
            for (int i = 0; i < 3; i++) { // 3과목 입력
                score[j][i] = sc.nextInt(); // 성적 입력
                score[j][3] += score[j][i]; // 성적 누적
            }
            avg[j] = score[j][3] / 3.0f;  // 평균 계산
        }
        // 결과 출력
        for (int j = 0; j < stu; j++) {
            System.out.print(name[j] + "\t");
            for (int i = 0; i < 4; i++) {
                System.out.print(score[j][i] + "\t");
            }
            System.out.println(avg[j]);
        }
	}
}