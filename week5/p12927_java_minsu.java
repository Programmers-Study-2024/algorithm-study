package week5;

public class p12927_java_minsu {

    public static void main(String[] args) {
        // 문제 설명
        // 회사원 Demi는 가끔은 야근을 하는데요, 야근을 하면 야근 피로도가 쌓입니다. 
        // 야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다. 
        // Demi는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다.Demi가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 
        // 퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 함수 solution을 완성해주세요.

        int n = 4;
        int[] works = {4, 3, 3};

        System.out.println(solution(n, works));
    }

    public static long solution(int n, int[] works) {
        long answer = 0;

        while (n > 0) {
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < works.length; i++) {
                if (works[i] > max) {
                    max = works[i];
                    maxIndex = i;
                }
            }

            if (works[maxIndex] == 0) {
                break;
            }

            works[maxIndex]--;
            n--;
        }

        for (int i = 0; i < works.length; i++) {
            answer += works[i] * works[i];
        }

        return answer;
    }
    

}
