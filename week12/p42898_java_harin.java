package week12;
/**
 * lv 3
 * 등굣길
 */
public class p42898_java_harin {
    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int[][] dp = new int[n+1][m+1];
            dp[1][1] = 1;
            int K = 1000000007;
            for (int[] puddle : puddles) {
                dp[puddle[1]][puddle[0]] = -1; // 물에 잠긴 지역 표시
            }

            for (int i=1; i<=n; i++){
                for (int j=1; j<=m; j++){
                    if (dp[i][j] == -1) continue;
                    if (dp[i-1][j] != -1 && dp[i][j-1] != -1){
                        dp[i][j] += (dp[i-1][j] + dp[i][j-1]) % K;
                    }
                    else if (dp[i][j-1] != -1 && dp[i-1][j] == -1) dp[i][j] += dp[i][j-1]% K;
                    else if (dp[i-1][j] != -1 && dp[i][j-1] == -1) dp[i][j] += dp[i-1][j]% K;
                }
            }
            return dp[n][m] % K;
        }
    }
}
