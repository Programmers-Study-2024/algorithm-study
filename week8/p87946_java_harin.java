package week8;
import java.util.*;
/**
 * lv 2
 * 피로도
 */
public class p87946_java_harin {
    /**
     * 재귀 + 백트래킹으로 가능한 모든 경우 탐색하는 방법으로 풀음
     * 아직 어색해서 더 연습 해봐야할듯
     */
    class Solution {
        private int maxDungeons = 0;

        public int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length];
            explore(k, dungeons, visited, 0);
            return maxDungeons;
        }

        private void explore(int k, int[][] dungeons, boolean[] visited, int count) {
            maxDungeons = Math.max(maxDungeons, count);

            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && k >= dungeons[i][0]) {
                    visited[i] = true;
                    explore(k - dungeons[i][1], dungeons, visited, count + 1); // 가능한 던전 탐험 순서 시도
                    visited[i] = false; // 백트래킹
                }
            }
        }
    }

    /**
     * 1. "최소 필요 피로도 - 소모 피로도"로 배열 내림차순 정렬 해줌
     * 2. 다음 조건에 맞게 계산해줌
     * 테케 9, 12, 13에서 실패함. 모든 가능한 경우의 수를 고려하고 있지 않는 풀이같다.
     */
    class BadSolution {
        public int solution(int k, int[][] dungeons) {
            int answer = 0;
            Arrays.sort(dungeons, Collections.reverseOrder((o1, o2) -> (o1[0] - o1[1]) - (o2[0] - o2[1])));
            for (int i=0; i<dungeons.length; i++){
                if (k >= dungeons[i][0]){
                    k -= dungeons[i][1];
                    answer++;
                }
            }
            return answer;
        }
    }
}
