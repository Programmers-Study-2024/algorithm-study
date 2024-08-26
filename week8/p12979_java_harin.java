package week8;
/**
 * lv 3
 * 기지국 설치
 * 1 2 3 4 5 6 7 8 9 10 11
 * c   s x e             x
 * 1 2 3 4 5 6 7 8 9 10 11
 *           c       s  x  e
 */
public class p12979_java_harin {
    class Solution {
        public int solution(int n, int[] stations, int w) {
            int answer = 0;
            int current = 1; // 현재 커버해야 하는 아파트의 시작점
            int range = 2 * w + 1; // 하나의 기지국이 커버할 수 있는 아파트 수

            for (int station : stations){
                int start = station - w;
                int end = station + w;

                // 커버되지 않은 구간
                if (current < start){
                    int uncovered = start - current; // 커버되지 않은 아파트 수
                    answer += Math.ceil((double) uncovered / range);
                }
                current = end + 1;
            }

            // 마지막 기지국 이후 남은 구간 있으면 처리
            if (current <= n) {
                int uncovered = n - current + 1; // 마지막 기지국이 커버하지 못한 구간의 아파트 수
                answer += Math.ceil((double) uncovered / range);
            }

            return answer;
        }
    }
}
