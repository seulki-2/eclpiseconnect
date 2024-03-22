import java.util.*;

public class BaseballHw {
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
        Random random = new Random();
     System.out.println("숫자 야구 게임을 시작합니다.");
     System.out.println("몇 번의 게임을 할까요?");
     int num = sc.nextInt();
     
     int count =0;
     int total=+count;
     
     for(int n=0; n<num; n++){
        int[] answer = generateRandomNumbers(); // 랜덤으로 생성된 숫자 배열
    
        System.out.println("========================");
        System.out.println((n+1) +"번째 숫자 야구 게임을 시작합니다");
        System.out.println("========================");
        System.out.println("하단의 숫자는 실게임에서는 지우고 실행합니다.");
        System.out.println(Arrays.toString(answer));
       count = 0;
        while (true) {
            System.out.print("3개의 숫자를 입력하세요: ");
            String input = sc.next();
            int[] guess = convertInputToIntArray(input); // 입력값을 배열로 변환

            // 입력한 숫자와 정답을 비교하여 결과 계산
            int strike = countStrike(answer, guess);
            int ball = countBall(answer, guess);
           
            
            // 결과 출력
            if (strike == 3) {
                System.out.println("3스트라이크! 정답입니다!");
                count++;
                break; // 3 스트라이크이면 게임 종료
            } else {
                System.out.println("스트라이크: " + strike + ", 볼: " + ball);
                count++;
            }
        } 
        System.out.println("정답은 " + count + "번만에 맞췄습니다.");
        total += count;
     }
     System.out.println(num + "번의 게임숫자를 평균 " + (float)total / num + "번 만에 맞췄습니다.");
     sc.close();
    }

    // 랜덤으로 생성된 3자리 숫자 배열 생성
    public static int[] generateRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(10); // 0부터 9까지의 랜덤 숫자 생성
        }
        return numbers;
    }

    // 입력값을 정수 배열로 변환
    public static int[] convertInputToIntArray(String input) {
        int[] guess = new int[3];
        for (int i = 0; i < 3; i++) {
            guess[i] = input.charAt(i) - '0';
        }
        return guess;
    }

    // 스트라이크 개수 계산
    public static int countStrike(int[] answer, int[] guess) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (answer[i] == guess[i]) {
                strike++;
            }
        }
        return strike;
    }

    // 볼 개수 계산
    public static int countBall(int[] answer, int[] guess) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && answer[i] == guess[j]) {
                    ball++;
                }
            }
        }
        return ball;
    }
}