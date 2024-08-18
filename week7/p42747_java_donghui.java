package week7;

import java.util.Arrays;

public class p42747_java_donghui {
    public int solution(int[] citations) {
        int answer = 0;
        // 정렬
        Arrays.sort(citations);

        // 0~n 까지 돌면서 인용 횟수랑 h편 이상 인용된 개수 중 작은 값이 h-index
        int n = citations.length;

        int h = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            h = Math.min(citations[i], n - i);
            max = Math.max(max, h);
        }
        answer = max;

        return answer;
    }

}
