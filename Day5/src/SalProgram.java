import java.util.Scanner;

public class SalProgram {

    static Scanner scanner = new Scanner(System.in);
    static Employee[] employees;
    static int numEmployees = 0;

    public static void main(String[] args) {
        System.out.println("급여 관리 프로그램입니다.");

        while (true) {
            System.out.println("\n메뉴를 선택하세요:");
            System.out.println("1. 급여 정보 입력");
            System.out.println("2. 급여 정보 수정");
            System.out.println("3. 급여 정보 조회");
            System.out.println("4. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    inputSalaryInfo();
                    break;
                case 2:
                    modifySalaryInfo();
                    break;
                case 3:
                    displaySalaryInfo();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }

    static void inputSalaryInfo() {
        System.out.println("급여 정보를 입력합니다.");
        System.out.println("직원의 수를 입력하세요:");
        numEmployees = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\n직원 #" + (i + 1) + " 정보 입력:");
            System.out.println("이름:");
            String name = scanner.nextLine();
            System.out.println("급여:");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // 버퍼 비우기

            employees[i] = new Employee(name, salary);
        }

        System.out.println("급여 정보 입력이 완료되었습니다.");
    }

    static void modifySalaryInfo() {
        if (numEmployees == 0) {
            System.out.println("급여 정보가 없습니다.");
            return;
        }

        System.out.println("급여 정보를 수정합니다.");
        System.out.println("수정할 직원의 이름을 입력하세요:");
        String name = scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("새로운 급여를 입력하세요:");
                double newSalary = scanner.nextDouble();
                scanner.nextLine(); // 버퍼 비우기

                employees[i].setSalary(newSalary);
                System.out.println("급여 정보가 수정되었습니다.");
                return;
            }
        }

        System.out.println("해당하는 이름의 직원이 없습니다.");
    }

    static void displaySalaryInfo() {
        if (numEmployees == 0) {
            System.out.println("급여 정보가 없습니다.");
            return;
        }

        System.out.println("급여 정보를 조회합니다.");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("이름: " + employees[i].getName() + ", 급여: " + employees[i].getSalary());
        }
    }

    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}