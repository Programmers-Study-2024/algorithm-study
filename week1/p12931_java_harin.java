package week1;

/**
 * 12931
 * 자릿수 더하기
 */
public class p12931_java_harin {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            String N = String.valueOf(n); // int to String

            for (char i: N.toCharArray()){
                int j = i - '0'; // char to int
                answer += j;
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(123));
    }
}
