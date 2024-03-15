import java.util.Scanner;

public class Review {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
 
        System.out.println("성적 입력을 시작합니다.");
        System.out.println("학생의 수를 입력하세요:");
        int num = sc.nextInt();
         StuInfo[] students = new StuInfo[num];

        //Review[] students = new Review[num];
        for (int i = 0; i < num; i++) {
        	students[i] = new StuInfo();
            System.out.println("학생의 이름을 입력하세요:");
            students[i].setName(sc.next());
            System.out.println("국어 성적을 입력하세요:");
            students[i].setKor(sc.nextInt());
            System.out.println("영어 성적을 입력하세요:");
            students[i].setEng(sc.nextInt());
            System.out.println("수학 성적을 입력하세요:");
            students[i].setMat(sc.nextInt());
            students[i].setSum(students[i].getKor() + students[i].getEng() + students[i].getMat());
            students[i].setAvg(students[i].getSum() / 3.0f);
        }
        System.out.println("학생들의 정보를 출력합니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("이름: " + students[i].getName());
            System.out.println("국어 성적: " + students[i].getKor());
            System.out.println("영어 성적: " + students[i].getEng());
            System.out.println("수학 성적: " + students[i].getMat());
            System.out.println("총점: " + students[i].getSum());
            System.out.println("평균: " + students[i].getAvg());
            System.out.println();
        }
    }
}