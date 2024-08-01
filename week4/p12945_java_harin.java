package week4;
/**
 * lv 2
 * 피보나치 수
 */
public class p12945_java_harin {
    static class Solution {
        public int solution(int n) {
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i=2; i<=n; i++){
                dp[i] += (dp[i-2] + dp[i-1]) % 1234567; // 모든 단계에서 나머지로 구해줘야 오버플로우 안남
            }
            return dp[n];
        }
    }
}
