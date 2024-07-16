package week2;

/**
 * lv 1
 * 짝수와 홀수
 */
public class p12937_java_harin {
    static class Solution {
        public String solution(int num) {
            return ((num % 2 == 0) ? "Even" : "Odd");
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(4));
    }
}
