package week5;
/**
 * lv 2
 * 멀리 뛰기
 */
public class p12914_java_harin {
    /**
     * n 도달 경우의 수 = n-1 도달 경우의 수 + n-2 도달 경우의 수
     * dp로 푸는게 효율적이다
     * 점화식 : dp[i] = dp[i-1] + dp[i-2]
     */
    class Solution {
        public long solution(int n) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            long dp[] = new long[n+1];
            dp[1] = 1; // 1칸 도착 경우 : 1
            dp[2] = 2; // 2칸 도착 경우 : 11, 2
            for (int i=3; i<=n; i++){
                dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
            }
            return dp[n];
        }
    }


    /**
     * 조합 이용해서 푸려고 했는데 테케는 통과했는데 제출에서 실패..
     * n이 2000까지여서 버퍼오버플로떄문에 런타임에러 발생
     */
    class Bad_Solution {
        public long solution(int n) {
            long answer = 1;
            long two = 0;
            while (n >= 0){
                n -= 2; // 1의 개수
                two += 1; // 2의 개수

                answer += (factorial(n+two)) / ((factorial(n)) * (factorial(two)));
            }
            return answer % 1234567;
        }

        private long factorial (long sum){
            if (sum <= 1) return 1;
            return sum * factorial(sum-1);
        }
    }
}
