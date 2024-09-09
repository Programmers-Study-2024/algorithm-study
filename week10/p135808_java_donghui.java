package week10;

import java.util.Arrays;

public class p135808_java_donghui {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        int sum = 0;
        int count = 0;
        for (int j = score.length - 1; j >= 0; j--) {

            if (score[j] <= k) {
                count++;
            }

            if (count == m) {
                answer += score[j] * m;
                count = 0;
            }
        }
        return answer;
    }
}
