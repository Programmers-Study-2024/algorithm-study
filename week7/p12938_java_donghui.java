package week7;

public class p12938_java_donghui {

    // 19 /3 = 6 .. 1   [6,6,7]
    // 20 / 3 = 6 .. 2  [6,7,7]

    // s / n 가 일때 -1
    public int[] solution(int n, int s) {
        int value = s / n;
        int left = s % n;      // 더해줘야하는 수
        int[] answer = new int[n];
        if (value == 0) answer = new int[]{-1};
        else {
            for (int i = 0; i < n; i++) {
                answer[i] = value;
            }

            // 뒤에서부터 더해주기
            for (int j = 0; j < left; j++) {
                answer[n - j - 1] = answer[n - j - 1] + 1;
            }
        }


        return answer;
    }
}
