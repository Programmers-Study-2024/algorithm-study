package week14;
/**
 * lv 2
 * 2 x n 타일링
 */
public class p12900_java_harin {
    class Solution {
        public int solution(int n) {
            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i=3; i<=n; i++){
                dp[i] = (dp[i-1] + dp[i-2])% 1000000007;
            }
            return dp[n];
        }
    }
}
