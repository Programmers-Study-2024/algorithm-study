package week1;

/**
 * 약수의 합
 */
public class p12928_java_harin {
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i < n + 1; i++) { // i 0부터 시작하면 n을 못나눔
                if (n % i == 0) answer += i;
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(12));
    }
}
