package week12;

import java.util.Arrays;

public class p43105_java_donghui {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][500];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = triangle[i][j];
                if (j == 0) {                            // 0 일때
                    dp[i][j] += dp[i - 1][j];
                } else if (j == triangle[i].length - 1) {  // 맨 끝일때
                    dp[i][j] += dp[i - 1][j - 1];
                } else
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);

            }
        }
        Arrays.sort(dp[triangle.length - 1]);
        answer = dp[triangle.length - 1][499];


        return answer;
    }
}
