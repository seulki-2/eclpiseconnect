import java.util.*;

public class Salary {

	public static double DP(Employee emp, WorkInfo workInfo) {
        double grdaePay = emp.getGrade() * 10000; // 예: 부서 등급이 1일 경우 시간당 10,000원. 시간당 기본 임금
        boolean isBirthday = isBirthday(emp.getAnniversary(), workInfo.getWorkdate());
        double birbonus = isBirthday ? 50000 : 0; // 생일이면 5만원 추가 보너스
        double nightPay = workInfo.getNightworktime()*grdaePay;
        double weekPay = workInfo.getHolidayworktime()*grdaePay;
        double dailyPay = grdaePay + nightPay*1.2 + weekPay*1.5 + birbonus;
        return dailyPay;
    }
		
    private static boolean isBirthday(String anniversary, int workdate) {
		return false;
	}


	private static int numemp = 0; // 직원 수
    private static int numinfo = 0; // 근무 정보 수
    private static Employee[] emp; // 직원 배열
    private static WorkInfo[] info; // 근무 정보 배열

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("급여 관리 프로그램입니다.");

        while (true) {
            System.out.println("1.급여정보 입력  2.급여정보 수정  3.개인 급여정보 검색  4.조건별 검색  5.전체 출력  6.종료");
            int program = sc.nextInt();

            switch (program) {
                case 1:
                    inputSal();
                    break;
                case 2:
                    modifySal();
                    break;
                case 3:
                    individualSal();
                    break;
                case 4:
                	conSal();
                	break;
                case 5:
                    allSal();
                    break;
                case 6:
                    System.out.println("급여정보 프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 명령어입니다.");
            }
        }
    }


    public static void inputSal() { //급여입력 메소드
        System.out.println("급여정보 입력을 시작합니다.");
        System.out.println("몇명의 직원 급여정보를 입력할까요?");
        numemp = sc.nextInt();
        emp = new Employee[numemp];
        info = new WorkInfo[numemp];
        for (int i = 0; i < numemp; i++) {
            emp[i] = new Employee();

            System.out.println((i + 1) + "번째 직원의 사원번호를 입력해주세요.");
            emp[i].setKbpin(sc.nextInt());
            System.out.println("직원 이름을 입력해주세요.");
            emp[i].setName(sc.next());
            System.out.println("연차를 입력해주세요.");
            emp[i].setJoindate(sc.next());
            System.out.println("고용형태를 입력해주세요.(1=정규직, 2=비정규직)");
            emp[i].setEmptype(sc.nextInt());
            System.out.println("생일을 입력해주세요.(MMDD로 입력해주세요.)");
            emp[i].setAnniversary(sc.next());
            System.out.println("직원이 소속되어 있는 부서의 등급을 입력하세요(1~5)");
            emp[i].setGrade(sc.nextInt());
            System.out.println("급여일을 입력해주세요.");
            emp[i].setSalaryday(sc.next());
            System.out.println("급여 지급 은행명을 입력해주세요.");
            emp[i].setSalarybank(sc.next());
            System.out.println("급여 지급 계좌번호를 입력해주세요.");
            emp[i].setSalaryaccount(sc.nextLong());
            System.out.println("급여 관리자 여부를 입력해주세요(Y/N)");
            emp[i].setSupervisortype(sc.next());
        
            info[i] = new WorkInfo();
            System.out.println("==================================");
            System.out.println("근무 정보를 입력합니다.");
            System.out.println("근무일자를 입력하세요(MMDD).");
            info[i].setWorkdate(sc.nextInt());
            System.out.println("정규 근무시간을 입력하세요.");
            info[i].setDayworktime(sc.nextInt());
            System.out.println("야근 시간을 입력하세요.");
            info[i].setNightworktime(sc.nextInt());
            System.out.println("휴일 근무 시간을 입력하세요.");
            info[i].setHolidayworktime(sc.nextInt());
        }
    }
    public static void modifySal() { //급여정보 수정
        System.out.println("급여 정보를 수정합니다.");
        System.out.println("관리자 사원번호를 입력하세요:");
        int kbpin = sc.nextInt();

        for (int i = 0; i < numemp; i++) {
            if (emp[i].getKbpin() == kbpin) {
                // 관리자 여부 확인
                if (emp[i].isSupervisortype().equals("Y")||emp[i].isSupervisortype().equals("y")) {
                System.out.println("급여정보를 수정합니다.");
                System.out.println("1.사원번호  2.이름  3.입사일  4.고용형태  5 생일  6.부서등급  7.급여일  8.급여지급 은행명  9.급여지급 계좌번호  10.근무일자  13.정규근무시간  14.야근시간  15.주말근무시간 ");
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("사원번호 수정합니다.");
                        System.out.println("새로운 사원번호 입력하세요:");
                        emp[i].setKbpin(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 2:
                        System.out.println("이름 수정합니다.");
                        System.out.println("새로운 이름 입력하세요:");
                        emp[i].setName(sc.next());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 3:
                        System.out.println("입사일 수정합니다.");
                        System.out.println("새로운 입사일 입력하세요:");
                        emp[i].setJoindate(sc.next());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 4:
                        System.out.println("고용형태 수정합니다.");
                        System.out.println("새로운 고용형태 입력하세요:");
                        emp[i].setEmptype(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 5:
                        System.out.println("생일을 수정합니다.");
                        System.out.println("새로운 생일 입력하세요:");
                        emp[i].setAnniversary(sc.next());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 6:
                        System.out.println("부서등급 수정합니다.");
                        System.out.println("새로운 부서등급 입력하세요:");
                        emp[i].setGrade(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 7:
                        System.out.println("급여일 수정합니다.");
                        System.out.println("새로운 급여일 입력하세요:");
                        emp[i].setSalaryday(sc.next());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 8:
                        System.out.println("급여지급 은행명 수정합니다.");
                        System.out.println("새로운 급여지급 은행명 입력하세요:");
                        emp[i].setSalarybank(sc.next());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 9:
                        System.out.println("급여지급 계좌번호 수정합니다.");
                        System.out.println("새로운 급여지급 계좌번호 입력하세요:");
                        emp[i].setSalaryaccount(sc.nextLong());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 10:
                        System.out.println("근무일자 수정합니다.");
                        System.out.println("새로운 근무일자를 입력하세요:");
                        info[i].setWorkdate(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 11:
                        System.out.println("정규 근무시간을 수정합니다.");
                        System.out.println("새로운 정규 근무시간을 입력하세요:");
                        info[i].setDayworktime(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 12:
                        System.out.println("야근 시간을 수정합니다.");
                        System.out.println("새로운 야근시간을 입력하세요:");
                        info[i].setNightworktime(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    case 13:
                        System.out.println("휴일 근무 시간을 수정합니다.");
                        System.out.println("새로운 휴일 근무시간을 입력하세요:");
                        info[i].setHolidayworktime(sc.nextInt());
                        System.out.println("수정 완료 되었습니다.");
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                }
            }else {
                System.out.println("관리자만 수정할 수 있습니다.");
            }
    }
}
System.out.println("직원정보가 없습니다.");
}

    public static void individualSal() { //개인별 급여 정보 조회
        System.out.println("급여 정보를 조회합니다.");
        System.out.println("조회를 원하는 직원 사원번호를 입력하세요:");
        int kbpin = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < numemp; i++) {
            if (emp[i].getKbpin() == kbpin) {
                found = true;
                System.out.println("입력된 정보는 다음과 같습니다.");
                System.out.println("=====================================================");
                System.out.println("사원번호: " + emp[i].getKbpin());
                System.out.println("이름: " + emp[i].getName());
                System.out.println("근무연차: " + emp[i].getJoindate());
                System.out.println("고용형태: " + emp[i].getEmptype());
                System.out.println("생일: " + emp[i].getAnniversary());
                System.out.println("부서 등급: " + emp[i].getGrade());
                System.out.println("급여일: " + emp[i].getSalaryday());
                System.out.println("급여 지급 은행명: " + emp[i].getSalarybank());
                System.out.println("급여 지급 계좌번호: " + emp[i].getSalaryaccount());
                System.out.println("급여 관리자 여부: " + emp[i].isSupervisortype());
                System.out.println("=====================================================");
                System.out.println("계산된 급여는 다음과 같습니다.");
                
                double dailyPay = DP(emp[i], info[i]);
                double monthlyPay = 30*DP(emp[i], info[i]);
                
                System.out.println("일급: " + dailyPay);
                System.out.println("월급: " + (long)monthlyPay);
                System.out.println("=====================================================");
            }
        }
        if (!found) {
            System.out.println("직원정보가 없습니다.");
        }
    }
    public static void conSal() {
        System.out.println("정규직/비정규직의 급여조회를 합니다.");
        System.out.println("정규직 = 1, 비정규직 = 2 를 입력해주세요");
        int emptype = sc.nextInt();
        boolean found = false;
        int totalDailyPay = 0;
        int totalMonthlyPay = 0;
        int totalAnnualPay = 0;
        int count = 0;
        
        for (int i = 0; i < numemp; i++) {
            if (emp[i].getEmptype() == emptype) {
                found = true;
                count++;
                double dailyPay = DP(emp[i], info[i]);
                totalDailyPay += dailyPay;
                totalMonthlyPay += dailyPay * 30;
                totalAnnualPay += dailyPay * 30 * 12;
            }
        }
        
        if (found) {
            System.out.println("직원 수: " + count);
            System.out.println("총 일급: " + totalDailyPay);
            System.out.println("총 월급: " + totalMonthlyPay);
            System.out.println("총 연봉: " + totalAnnualPay);
        } else {
            System.out.println("해당하는 직원이 없습니다.");
        }
    }
    
    public static void allSal() { //전체 등록된 급여정보 조회
        System.out.println("직원 전체 급여 정보를 조회합니다.");
        for (int i = 0; i < numemp; i++) {
            System.out.println("==========================================");
            System.out.println(emp[i].getName() + " 의 정보입니다.");
            System.out.println("사원번호: " + emp[i].getKbpin());
            System.out.println("입사일: " + emp[i].getJoindate());
            System.out.println("고용형태: " + emp[i].getEmptype());
            System.out.println("생일: " + emp[i].getAnniversary());
            System.out.println("부서 등급: " + emp[i].getGrade());
            System.out.println("급여일: " + emp[i].getSalaryday());
            System.out.println("급여 지급 은행명: " + emp[i].getSalarybank());
            System.out.println("급여 지급 계좌번호: " + emp[i].getSalaryaccount());
            System.out.println("급여 관리자 여부: " + emp[i].isSupervisortype());
            System.out.println("==========================================");
        }
    }
}
