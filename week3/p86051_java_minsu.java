package week3;

public class p86051_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
        // numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            boolean isExist = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                answer += i;
            }
        }

        // return answer;
    }
}
