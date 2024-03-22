import java.util.Scanner;

public class LinkedNodeScore {
	static LinkedNodeSub head;
	static LinkedNodeSub cur;
	static int num;

//성적순 출력 , 삽입정렬 이용 add할 때 부터 내림차순 정렬하기!!
	public static void main(String[] args) {
		head = cur = new LinkedNodeSub();
		head.nexts = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------");
			System.out.println("|   ★성적 관리 시스템입니다★    |");
			System.out.println("-------------------------");
			System.out.println("원하는 작업을 선택하세요:");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 수정");
			System.out.println("3. 학생 성적 삭제");
			System.out.println("4. 학생 성적 조회");
			System.out.println("5. 종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				input();
				break;
			case 2:
				modify();
				break;
			case 3:
				del();
				break;
			case 4:
				con();
				break;
			case 5:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}

	public static void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 성적을 입력할까요?");
		num = sc.nextInt();
		int[] total = new int[num];

		
		cur = head;
		for (int t = 0; t < (num-1); t++) {
//			 if (total[t] > total[t + 1]) {
//	                System.out.println("ERROR");}
//			 else {
	   	for (int i = 0; i < num; i++) {
			System.out.print("학생 이름을 넣어주세요.");
			String name = sc.next();
			System.out.print("영어 성적을 넣어주세요.");
			int eng = sc.nextInt();
			System.out.print("국어 성적을 넣어주세요.");
			int kor = sc.nextInt();
			System.out.print("수학 성적을 넣어주세요.");
			int mat = sc.nextInt();
			System.out.println("========================");

			LinkedNodeSub sub = new LinkedNodeSub();
			sub.setName(name);
			sub.setKor(kor);
			sub.setEng(eng);
			sub.setMat(mat);
			sub.setTotal(eng+kor+mat);

			sub.nexts = head;
			head = sub;

			int j, temp = total[i];
			for (j = i; j > 0 && total[j - 1] > temp; j--) {
				total[j] = total[j - 1];
			}
			total[j] = temp;
			
	   	}return;
			 }
		}



	public static void modify() { // 입력된 성적 수정 메소드
		Scanner sc = new Scanner(System.in);

		System.out.println("입력된 성적을 수정합니다.");
		System.out.println("수정을 원하는 학생의 이름을 입력해주세요.");

		String na = sc.next();

		// LinkedNodeSub sub = new LinkedNodeSub();
		cur = head;
		for (int i = 0; i < num; i++) {
			if (na.equals(cur.getName())) {

				System.out.println(na + " 학생 정보를 수정합니다.");
				System.out.println("수정할 항목을 선택하세요.");
				System.out.println("1. 영어 2. 국어 3. 수학");
				int a = sc.nextInt();

				switch (a) {
				case 1:
					System.out.println("영어 성적을 수정합니다.");
					cur.setEng(sc.nextInt());
					System.out.println("성적이 수정되었습니다.");
					break;
				case 2:
					System.out.println("국어 성적을 수정합니다.");
					cur.setKor(sc.nextInt());
					System.out.println("성적이 수정되었습니다.");
					break;
				case 3:
					System.out.println("수학 성적을 수정합니다.");
					cur.setMat(sc.nextInt());
					System.out.println("성적이 수정되었습니다.");
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					break;
				}
				return;

			}
			cur = cur.nexts;
		}

		System.out.println("학생 정보가 없습니다.");
	}

	public static void del() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번째 학생 데이터를 삭제할까요? "); // 데이터 삭제
		int del = sc.nextInt();

		cur = head;
		if (del == 1) {
			head = head.nexts;
		} else {
			cur.nexts = cur.nexts.nexts;
		}
		cur = head;

		System.out.println("-------------------삭제 완료된 데이터 입니다.-------------------");
		System.out.println("|  이름  |  영어점수  |  국어점수  |  수학점수  |   총점   |   평균   |");
		System.out.println("-------------------------------------------------------");
		while (cur.getName() != null) {
			System.out.print("| " + cur.getName() + "  |");
			System.out.print("    " + cur.getEng() + "   |");
			System.out.print("    " + cur.getKor() + "   |");
			System.out.print("   " + cur.getMat() + "   |");
			System.out.print("   " + (cur.getEng() + cur.getKor() + cur.getMat()) + "  |");
			System.out.println("   " + ((cur.getEng() + cur.getKor() + cur.getMat()) / 3.f) + "  |");
			cur = cur.nexts;
		}
		System.out.println("-------------------------------------------------------");
	}

	public static void con() {
		cur = head;
		System.out.println("-----------------------------------------------------------");
		System.out.println("|  이름  |  영어점수  |  국어점수  |  수학점수  |   총점   |   평균   |");
		System.out.println("-----------------------------------------------------------");
		while (cur.getName() != null) {
			System.out.print("| " + cur.getName() + "  |");
			System.out.print("    " + cur.getEng() + "   |");
			System.out.print("    " + cur.getKor() + "   |");
			System.out.print("   " + cur.getMat() + "    |");
			System.out.print("   " + (cur.getEng() + cur.getKor() + cur.getMat()) + "   |");
			System.out.println("   " + ((cur.getEng() + cur.getKor() + cur.getMat()) / 3.f) + "   |");
			cur = cur.nexts;
		}
		System.out.println("-----------------------------------------------------------");
	}
}
