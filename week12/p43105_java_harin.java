package week12;
import java.util.*;
/**
 * lv 3
 * 정수 삼각형
 */
public class p43105_java_harin {
    class Solution {
        public int solution(int[][] triangle) {
            int answer = 0;
            int len = triangle.length;
            int[][] dp = new int[len][len];
            dp[0][0] = triangle[0][0];

            for (int i=1; i<len; i++){
                dp[i][0] += triangle[i][0] + dp[i-1][0]; // 왼쪽 합
                for (int j=1; j<triangle[i].length; j++){
                    dp[i][j] += triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]); // 왼 or 오
                }
            }
            return Arrays.stream(dp[len-1]).max().getAsInt();
        }
    }
}
