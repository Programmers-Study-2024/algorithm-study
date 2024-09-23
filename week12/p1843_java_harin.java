package week12;
/**
 * lv 4
 * 사칙연산
 * 구글링으로 풀었습니다..
 */
public class p1843_java_harin {
    class Solution {
        public int solution(String arr[]) {
            int n = arr.length / 2 + 1;
            int[][] maxDP = new int[n][n];
            int[][] minDP = new int[n][n];

            // 초기화: 숫자를 DP 테이블에 넣기
            for (int i = 0; i < n; i++) {
                maxDP[i][i] = Integer.parseInt(arr[2 * i]);
                minDP[i][i] = Integer.parseInt(arr[2 * i]);
            }

            // DP로 가능한 모든 연산 결과 구하기
            for (int length = 1; length < n; length++) {
                for (int i = 0; i < n - length; i++) {
                    int j = i + length;
                    maxDP[i][j] = Integer.MIN_VALUE;
                    minDP[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        String operator = arr[2 * k + 1];
                        if (operator.equals("+")) {
                            maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] + maxDP[k + 1][j]);
                            minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] + minDP[k + 1][j]);
                        } else if (operator.equals("-")) {
                            maxDP[i][j] = Math.max(maxDP[i][j], maxDP[i][k] - minDP[k + 1][j]);
                            minDP[i][j] = Math.min(minDP[i][j], minDP[i][k] - maxDP[k + 1][j]);
                        }
                    }
                }
            }

            return maxDP[0][n - 1];
        }
    }
}
