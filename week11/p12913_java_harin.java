package week11;
/**
 * lv 2
 * 땅따먹기
 */
public class p12913_java_harin {
    class Solution {
        int solution(int[][] land) {
            int answer = 0;
            for(int i = 1; i < land.length; i++) {
                land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
                land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
                land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
                land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
            }

            // 마지막 행의 최댓값
            for(int i = 0; i < 4; i++) {
                answer = Math.max(answer, land[land.length-1][i]);
            }

            return answer;
        }
    }
}