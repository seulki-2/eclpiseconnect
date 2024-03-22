import java.util.*;

public class ScoHw {
	
	private static int num = 0;
	static StuInfo[] stu;
    static int numstu = 0;
	
	   static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) {
    
        while (true) {
            System.out.println("성적관리 프로그램입니다.");
            System.out.println("원하는 메뉴 번호를 선택하세요");
            System.out.println("1.성적입력 2.성적 수정 3.개인성적 조회 4.전체성적 조회 5.종료");
            int program = sc.nextInt();

            switch (program) {
                case 1:
                    inputScore();
                    break;
                case 2:
                    modifyScore();
                    break;
                case 3:
                    individualScore();
                    break;
                case 4:
                    allScores();
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

    public static void inputScore() { //성적입력 메소드
 

    			
    			
    			
        Scanner sc = new Scanner(System.in);
       
    	System.out.println("성적 입력을 시작합니다.");
    	 
    	ArrayList<StudentScoreHasA> stuList = new ArrayList<>(); //stuList ArrayList 생성
    	 
    	for (int i=0; i<10; i++) {
			stuList.add(new StudentScoreHasA());
			}
			
			System.out.println(stuList);
		}

	}
    	
    	
    	
    for (int i=0; i < numstu; i++) {   	
		stu[i]=new StuInfo();
        System.out.println((i+1) +"번째 학생의 학번을 입력해주세요.");
        stu[i].setNo(sc.nextInt());
        System.out.println("학생의 이름을 입력해주세요.");
        stu[i].setName(sc.next());
        System.out.println("국어 성적을 입력해주세요.");
        stu[i].setKor(sc.nextInt());
        System.out.println("영어 성적을 입력해주세요.");
        stu[i].setEng(sc.nextInt());
        System.out.println("수학 성적을 입력해주세요.");
        stu[i].setMat(sc.nextInt());
    }
    for (int i=0; i< numstu; i++) {
        System.out.println("==========================================================");
        System.out.println("학번: " + stu[i].getNo());
        System.out.println("이름: " + stu[i].getName());
        System.out.println("국어점수: " + stu[i].getKor());
        System.out.println("수학점수: " + stu[i].getMat());
        System.out.println("영어점수: " + stu[i].getEng());
        System.out.println("총점: " +stu[i].getKor()+stu[i].getMat()+stu[i].getEng());
        System.out.println("평균: " + (stu[i].getKor()+stu[i].getMat()+stu[i].getEng())/3.f);
        System.out.println("==========================================================");
     }
    }
    public static void modifyScore() { //입력된 성적 수정 메소드
        Scanner sc = new Scanner(System.in);
        
        System.out.println("입력된 성적을 수정합니다.");
        System.out.println("수정을 원하는 학생의 학번을 입력해주세요.");
       
        int no = sc.nextInt();

	    if (numstu == 0) {
            System.out.println("학생 정보가 없습니다.");
            return;
        }
        
        for (int i = 0; i < numstu; i++) { 
            if (stu[i].getNo() == no) {
	           System.out.println("학생 정보를 수정합니다.");
	           System.out.println("수정할 항목을 선택하세요.");
	           System.out.println("1. 국어 2. 영어 3. 수학");
	           int a = sc.nextInt();

	            switch (a) {
	                case 1:
                        System.out.println("국어 성적을 수정합니다.");
                        stu[i].setKor(sc.nextInt());
                        System.out.println("성적이 수정되었습니다.");
                        break;
                    case 2:
                        System.out.println("영어 성적을 수정합니다.");
                        stu[i].setEng(sc.nextInt());
                        System.out.println("성적이 수정되었습니다.");
                        break;
                    case 3:
                        System.out.println("수학 성적을 수정합니다.");
                        stu[i].setMat(sc.nextInt());
                        System.out.println("성적이 수정되었습니다.");
                        break;
                    default:
	                    System.out.println("잘못된 선택입니다.");
	                    break;
	            }
	           
	        }
	    } System.out.println("학생 정보가 없습니다.");
	}


    public static void individualScore() { //개인성적 조회
        System.out.println("개인 성적을 조회합니다.");
        System.out.println("조회를 원하는 학생의 학번을 입력해주세요.");
        int no = sc.nextInt();
	    if (numstu == 0) {
            System.out.println("학생 정보가 없습니다.");
            return;
        }
	    for (int i = 0; i < numstu; i++) {
		        if (stu[i].getNo() == no) {
		        System.out.println("==========================================================");
                System.out.println("학번: " + stu[i].getNo());
                System.out.println("이름: " + stu[i].getName());
                System.out.println("국어 성적: " + stu[i].getKor());
                System.out.println("영어 성적: " + stu[i].getEng());
                System.out.println("수학 성적: " + stu[i].getMat());
                System.out.println("==========================================================");
                System.out.println("총점: " +stu[i].getKor()+stu[i].getMat()+stu[i].getEng());
                System.out.println("평균: " + (stu[i].getKor()+stu[i].getMat()+stu[i].getEng())/3.f);
                System.out.println("==========================================================");
                break;
		        }
	    } System.out.println("학생 정보가 없습니다.");
 }
         
    public static void allScores() { //전체성적 조회
        System.out.println("전체 성적을 조회합니다.");
        for (int i = 0; i < numstu; i++) {
        	System.out.println("==========================================================");
            System.out.println("학번: " + stu[i].getNo());
            System.out.println("이름: " + stu[i].getName());
            System.out.println("국어 성적: " + stu[i].getKor());
            System.out.println("영어 성적: " + stu[i].getEng());
            System.out.println("수학 성적: " + stu[i].getMat());
            System.out.println("==========================================================");
            System.out.println("총점: " +stu[i].getKor()+stu[i].getMat()+stu[i].getEng());
            System.out.println("평균: " + (stu[i].getKor()+stu[i].getMat()+stu[i].getEng())/3.f);
            System.out.println("==========================================================");
        }
    }
}