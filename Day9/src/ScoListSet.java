import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ScoListSet {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<ScoInfo2> S = new HashSet<>();
        ScoListSet ss = new ScoListSet();

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

    public void inputScore(Set<ScoInfo2> s) { // 성적입력 메소드
        System.out.println("성적 입력을 시작합니다.");

        while (true) {
            System.out.println("학생의 이름을 입력해주세요. 종료를 원하시면 q를 입력해주세요.");
            String name = sc.next();
            if (name.equals("q"))
                break;

            System.out.println("학번을 입력해주세요.");
            int no = sc.nextInt();
            System.out.println("국어 성적을 입력해주세요.");
            int kor = sc.nextInt();
            System.out.println("영어 성적을 입력해주세요.");
            int eng = sc.nextInt();
            System.out.println("수학 성적을 입력해주세요.");
            int mat = sc.nextInt();
            ScoInfo2 stu = new ScoInfo2(name, no, kor, eng, mat);
            if (!s.contains(stu)) {
                s.add(stu);
            } else {
                System.err.println("동일한 정보를 가진 학생이 이미 존재합니다.");
                s.add(stu);
            }
        }
    }

    public void modifyScore(Set<ScoInfo2> aa) { // 성적 수정 메소드
        System.out.println("성적 수정을 시작합니다.");

        System.out.println("학생 학번을 입력해주세요.");
        int no = sc.nextInt();

        for (ScoInfo2 stu : aa) {
            if (stu.getNo() == no) {
                System.out.println("국어 성적을 수정해주세요.");
                stu.setKor(sc.nextInt());
                System.out.println("영어 성적을 수정해주세요.");
                stu.setEng(sc.nextInt());
                System.out.println("수학 성적을 수정해주세요.");
                stu.setMat(sc.nextInt());

                return;
            }
        }
        System.err.println("해당 학생을 찾을 수 없습니다.");
    }

    public void individualScore(Set<ScoInfo2> aa) { // 개인성적 조회 메소드
        System.out.println("개인 성적을 조회합니다.");

        System.out.println("조회를 원하는 학생의 학번을 입력하세요.");
        int no = sc.nextInt();

        for (ScoInfo2 stu : aa) {
            if (stu.getNo() == no) {
                System.out.println("이름: " + stu.getName());
                System.out.println("학번: " + stu.getNo());
                System.out.println("국어: " + stu.getKor());
                System.out.println("영어: " + stu.getEng());
                System.out.println("수학: " + stu.getMat());
                System.out.println("합계: " + (stu.getKor() + stu.getEng() + stu.getMat()));
                System.out.println("평균: " + (stu.getKor() + stu.getEng() + stu.getMat()) / 3.f);
                return;
            }
        }
        System.err.println("해당 학생을 찾을 수 없습니다.");
    }
    
    public void allScores(Set<ScoInfo2> aa) { // 전체 조회 메소드
        System.out.println("전체 학생 성적을 조회합니다.");
        for (ScoInfo2 stu : aa) {
                System.out.println("이름: " + stu.getName());
                System.out.println("학번: " + stu.getNo());
                System.out.println("국어: " + stu.getKor());
                System.out.println("영어: " + stu.getEng());
                System.out.println("수학: " + stu.getMat());
                System.out.println("합계: " + (stu.getKor() + stu.getEng() + stu.getMat()));
                System.out.println("평균: " + (stu.getKor() + stu.getEng() + stu.getMat()) / 3.f);
                System.out.println("============================================");
            }
        System.err.println("해당 학생을 찾을 수 없습니다.");
    }
}