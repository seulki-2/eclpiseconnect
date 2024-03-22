import java.util.Arrays;

public class MinSort {
    public static void main(String[] args) {
    	System.out.println("정렬전\t정렬후");
        for (int i = 1000; i < 10000; i++) {
            int sort = sortNumber(i);
            System.out.println(i + "\t" + sort);
        }
    }

    public static int sortNumber(int number) {
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {     // 숫자의 각 자릿수를 배열에 저장
            digits[i] = number % 10; //끝자리 숫자를 digits[]에 넣기
            number /= 10;  //나누기 통해서 한자리씩 제거
        }
        Arrays.sort(digits);         // 배열을 오름차순으로 정렬

        if (digits[0] == 0) {         // 첫 번째 자리에 0이 온 경우, 두 번째로 작은 숫자와 교환
            for (int i = 1; i < 4; i++) {
                if (digits[i] != 0) { //1이0이아니면..temp에 0 입력
                    int temp = digits[0]; 
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }
        // 정렬된 배열을 다시 숫자로 변환
        int sort = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
        return sort;
    }
}