package week12;

/**
 * lv 2
 * 2xn 타일링
 * 이런 타일 문제는 대부분 dp인듯.. 경우의 수 구하는거
 * - 점화식 : i번째 = i-1번째 + i-2번째
 */
public class p12900_java_harin {
    class Solution {
        public int solution(int n) {
            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i=3; i<=n; i++){
                dp[i] += (dp[i-1] + dp[i-2])%1000000007; // 나머지 주의
            }
            return dp[n];
        }
    }
}
