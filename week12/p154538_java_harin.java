package week12;
/**
 * lv 2
 * 숫자 변환하기
 */
public class p154538_java_harin {
    /**
     * x=10, y=40, n=5
     * dp[10] = 0 : 자기자신인 경우
     * dp[20 = 10*2] = 0+1
     * dp[30 = 10*3] = 0+1
     * dp[15 = 10+5] = 0+1
     * ...
     * dp[11] = -1
     * dp[30 = 15*2] = min(1+1, 1)
     * dp[20 = 15+5] = min(1+1, 1)
     * ...
     */
    class Solution {
        public int solution(int x, int y, int n) {
            int[] dp = new int[y+1];
            for (int i=x; i<=y; i++){
                // i 값이 x 자기자신이 아닌데 dp[i]가 0인 경우, 만들 수 없는 경우임
                if (i!=x && dp[i]==0){
                    dp[i] -= 1;
                    continue;
                }
                if (i+n <= y){
                    // i+n 값이 0 이면 무조건 i번째 단계 경우의수+1
                    // 그렇지 않으면, "dp[i+n] 에 있는 값"이랑, "i번째 단계 경우의수+1" 중에 더 작은 값을 선택
                    dp[i+n] = dp[i+n]==0 ? dp[i]+1 : Math.min(dp[i]+1, dp[i+n]);
                }
                if (i*2 <= y){
                    dp[i*2] = dp[i*2]==0 ? dp[i]+1 : Math.min(dp[i]+1, dp[i*2]);
                }
                if (i*3 <= y){
                    dp[i*3] = dp[i*3]==0 ? dp[i]+1 : Math.min(dp[i]+1, dp[i*3]);
                }
            }

            return dp[y];
        }
    }
}
