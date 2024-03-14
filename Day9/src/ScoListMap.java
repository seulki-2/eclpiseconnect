import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ScoListMap {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ScoInfo3> S = new HashMap<>();
        ScoListMap ss = new ScoListMap();

        while (true) {
            System.out.println("성적관리 프로그램입니다.");
            System.out.println("원하는 메뉴 번호를 선택하세요");
            System.out.println("1.성적입력 2.성적 수정 3.개인성적 조회 4.전체성적 조회 5.종료");
            int program = sc.nextInt();

            switch (program) {
                case 1:
                    ss.inputScore(S);
                    break;
                case 2:
                    ss.modifyScore(S);
                    break;
                case 3:
                    ss.individualScore(S);
                    break;
                case 4:
                    ss.allScores(S);
                    break;
                case 5:
                    System.out.println("성적 관리 프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 번호입니다.");
                    break;
            }
        }
    }

    public void inputScore(HashMap<Integer, ScoInfo3> s) { // 성적입력 메소드
        System.out.println("성적 입력을 시작합니다.");
        
        while (true) {
        	
        	 System.out.println("순번을 입력해주세요. 종료를 원하시면 0을 입력해주세요.");
             int i = sc.nextInt();
             if (i == 0)
                 break; 
             if (s.containsKey(i)){
            	 System.out.println("동일한 순번이 이미 존재합니다.");
             }else {
            	 System.out.println("학생의 이름을 입력해주세요.");
                 String name = sc.next();
                 System.out.println("학번을 입력해주세요.");
                 int no = sc.nextInt();
                 System.out.println("국어 성적을 입력해주세요.");
                 int kor = sc.nextInt();
                 System.out.println("영어 성적을 입력해주세요.");
                 int eng = sc.nextInt();
                 System.out.println("수학 성적을 입력해주세요.");
                 int mat = sc.nextInt();
                 ScoInfo3 stu = new ScoInfo3(name, no, kor, eng, mat);
                 s.put(i, stu);
             }
        }
    }

    public void modifyScore(HashMap<Integer, ScoInfo3> aa) { // 성적 수정 메소드
        System.out.println("성적 수정을 시작합니다.");
        Set<Integer> r = aa.keySet();
        
        System.out.println("성적 순번을 입력해주세요.");
        int i = sc.nextInt();

        if (aa.containsKey(i)) {
            System.out.println("국어 성적을 수정해주세요.");
            aa.get(i).setKor(sc.nextInt());
            System.out.println("영어 성적을 수정해주세요.");
            aa.get(i).setEng(sc.nextInt());
            System.out.println("수학 성적을 수정해주세요.");
            aa.get(i).setMat(sc.nextInt());
        } else {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    public void individualScore(HashMap<Integer, ScoInfo3> aa) { // 개인성적 조회 메소드
        System.out.println("개인 성적을 조회합니다.");

        System.out.println("조회를 원하는 성적 순번을 입력하세요.");
        int i = sc.nextInt();

        if (aa.containsKey(i)) {
            ScoInfo3 stu = aa.get(i);
            System.out.println("이름: " + stu.getName());
            System.out.println("학번: " + stu.getNo());
            System.out.println("국어: " + stu.getKor());
            System.out.println("영어: " + stu.getEng());
            System.out.println("수학: " + stu.getMat());
            System.out.println("합계: " + stu.getSum());
            System.out.println("평균: " + stu.getAvg());
        } else {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }
    
    public void allScores(HashMap<Integer, ScoInfo3> aa) { // 전체성적 조회 메소드
        System.out.println("전체 성적을 조회합니다.");
        Set<Integer> r = aa.keySet();
        for (Integer stu : r) {
        	System.out.println("순번: "+ stu);
            ScoInfo3 info = aa.get(stu);
            System.out.println("이름: " + info.getName());
            System.out.println("학번: " + info.getNo());
            System.out.println("국어: " + info.getKor());
            System.out.println("영어: " + info.getEng());
            System.out.println("수학: " + info.getMat());
            System.out.println("합계: " + info.getSum());
            System.out.println("평균: " + info.getAvg());
            System.out.println("=======================");
        }
    }
}