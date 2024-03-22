import java.util.Scanner;

public class LnikedExam {

    static LinkNode head;
    static LinkNode cur;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        head = cur = new LinkNode();
        head.next = null;

        head.setData(1);

        head.next = new LinkNode();
        head.next.setData(2);
        head.next.next = null;

        head.next.next = new LinkNode();
        head.next.next.setData(3);
        head.next.next.next = null;

        head.next.next.next = new LinkNode();
        head.next.next.next.setData(4);
        head.next.next.next.next = null;

        head.next.next.next.next = new LinkNode();
        head.next.next.next.next.setData(5);
        head.next.next.next.next.next = null;

        System.out.println("==========================");
        System.out.println("Single Linked List입니다.");
        System.out.println("==========================");

        System.out.println("\n원하는 작업을 선택하세요:");
        System.out.println("1. 데이터 추가");
        System.out.println("2. 데이터 삭제");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addData();
                break;
            case 2:
                delData();
                break;
            default:
                System.out.println("잘 못된 입력입니다.");
        }
    }

    private static void addData() {
        Scanner sc = new Scanner(System.in);

        cur = head;
        // 출력
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.next;
        }

        System.out.print("\n몇 번째에 데이터를 넣을까요? "); // 데이터 삽입
        int where = sc.nextInt();
        System.out.print("어떤 데이터를 넣을까요? ");
        int data = sc.nextInt();

        cur = head;
        for (int i = 1; i < where - 1; i++) {
            if (cur.next == null) {
                System.out.println("입력한 위치가 리스트의 범위를 벗어납니다.");
                return;
            }
            cur = cur.next;
        }

        LinkNode newNode = new LinkNode();
        newNode.setData(data);

        if (where == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            newNode.next = cur.next;
            cur.next = newNode;
        }
        cur = head;
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.next;
        }
    }

    public static void delData() {
        Scanner sc = new Scanner(System.in);
        
        cur = head;
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.next;
        }
        System.out.print("\n몇 번째 데이터를 삭제할까요? "); // 데이터 삭제
        int del = sc.nextInt();

        cur = head;
        for (int j = 1; j < del - 1; j++) {
            if (cur.next == null) {
                System.out.println("입력한 위치가 리스트의 범위를 벗어납니다.");
                return;
            }
            cur = cur.next;
        }

        if (del == 1) {
            head = head.next;
        } else {
            cur.next = cur.next.next;
        }

        cur = head;
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.next;
        }
    }
}