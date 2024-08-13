package week6;
import java.util.*;

/**
 * lv 3
 * 등굣길
 */
public class p42898_java_harin {


    /**
     * 두번째 풀이
     * mod 정의해주고, 조건 식 간단하게 바꿔줌
     */
    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int[][] dp = new int[n+1][m+1];
            int mod = 1000000007;
            for (int i=0; i<puddles.length; i++){
                dp[puddles[i][1]][puddles[i][0]] = -1;
            }
            dp[1][1] = 1;
            for (int i=1; i<=n; i++){
                for (int j=1; j<=m; j++){
                    if (dp[i][j] == -1) continue;
                    if (dp[i-1][j] > 0) dp[i][j] += dp[i-1][j] % mod;
                    if (dp[i][j-1] > 0) dp[i][j] += dp[i][j-1] % mod;
                }
            }
            return dp[n][m] % mod;
        }
    }

    /**
     * 첫번째 풀이
     * m열 n행인거 주의!!
     * puddle에 있는 dp를 -1로 지정해주고 puddle에 걸리면 해당 부분은 아무것도 안 더해주는 식으로 경우의수 세기
     */
    class BadSolution {
        public int solution(int m, int n, int[][] puddles) {
            int[][] dp = new int[n+1][m+1];
            dp[1][1] = 1;
            for (int i=0; i<puddles.length; i++){
                dp[puddles[i][1]][puddles[i][0]] = -1;
            }

            for (int i=1; i<=n; i++){
                for (int j=1; j<=m; j++){
                    if (dp[i][j] == -1) continue;
                    if (dp[i-1][j] != -1 && dp[i][j-1] != -1){
                        dp[i][j] += (dp[i-1][j] + dp[i][j-1]) % 1000000007;
                    }
                    if (dp[i-1][j] == -1 && dp[i][j-1] != -1){
                        dp[i][j] += dp[i][j-1] % 1000000007;
                    }
                    if (dp[i][j-1] == -1 && dp[i-1][j] != -1){
                        dp[i][j] += dp[i-1][j] % 1000000007;
                    }
                    if (dp[i-1][j] == -1 && dp[i][j-1] == -1){
                        dp[i][j] += 0;
                    }

                }
            }
            return dp[n][m] % 1000000007;
        }
    }
}
