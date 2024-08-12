package week6;

public class p42898_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 계속되는 폭우로 일부 지역이 물에 잠겼습니다. 물에 잠기지 않은 지역을 통해 학교를 가려고 합니다. 집에서 학교까지 가는 
        // 길은 m x n 크기의 격자모양으로 나타낼 수 있습니다.

        // 아래 그림은 m = 4, n = 3 인 경우입니다.

        // 가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)로 나타내고 가장 오른쪽 아래, 즉 학교가 있는 곳의 좌표는 (m, n)으로 나타냅니다.

        // 격자의 크기 m, n과 물이 잠긴 지역의 좌표를 담은 2차원 배열 puddles이 매개변수로 주어집니다. 오른쪽과 아래쪽으로만 움직여 
        // 집에서 학교까지 갈 수 있는 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return 하도록 solution 함수를 작성해주세요.

        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};

        System.out.println(solution(m, n, puddles));
    }

    public static int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;

        for (int[] puddle : puddles) {
            dp[puddle[0]][puddle[1]] = -1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }

                if (i - 1 > 0) {
                    dp[i][j] += dp[i - 1][j] % 1000000007;
                }
                if (j - 1 > 0) {
                    dp[i][j] += dp[i][j - 1] % 1000000007;
                }
            }
        }

        return dp[m][n] % 1000000007;
    }

}
