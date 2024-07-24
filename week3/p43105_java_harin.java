package week3;
import java.util.*;
/**
 * lv 3
 * 정수 삼각형
 * 입력 : [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
 * 출력 : 30
 * 1. dp문제고, 자식의 누적합이 가장 큰 값을 출력하는 문제이다.
 * 2. 이 때 트리에서 왼쪽 부분은 무조건 왼쪽끼리의 누적합이 가장 크므로 그부분을 먼저 계산해준다
 * 3. DP 점화식
 * - {자식의 현재 값 + (오대각선위 or 왼대각선위) 중 최댓값} 을 구해서 단말노드에 누적 합을 넣어놓는다
 * - DP[i][j] += triangle[i][j] + Math.max(dp[i-1][j-1], dp[j-1][j])
 * 4. 단말노드에 누적합 배열이 만들어졌으므로, 마지막 배열 중 최댓값을 출력하면 된다
 */
public class p43105_java_harin {

    static class Solution {
        public int solution(int[][] triangle) {
            int len = triangle.length;
            int[][] dp = new int[len][len];

            dp[0][0] = triangle[0][0];

            for (int i=1; i<len; i++){
                dp[i][0] = triangle[i][0] + dp[i-1][0]; // 트리에서 왼쪽은 무조건 왼쪽끼리의 합이 가장 큼
                for (int j=1; j<i+1; j++){
                    dp[i][j] += triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]); // dp 점화식
                }
            }
            // dp[len-1] 배열(마지막 배열)이 각 누적합을 더한 부분이므로 여기서 최댓값이 정답
            int ans = Arrays.stream(dp[len-1]).max().getAsInt();
            return ans;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
