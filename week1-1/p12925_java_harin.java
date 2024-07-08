package week2.week1;

/**
 * 문자열을 정수로 바꾸기
 */
public class p12925_java_harin {
    static class Solution {
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1234"));
    }
}
