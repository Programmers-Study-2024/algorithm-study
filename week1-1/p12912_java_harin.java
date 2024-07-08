package week2.week1;

/**
 * 두 정수 사이의 합
 */
public class p12912_java_harin {
    public static class Solution {
        public long solution(int a, int b) {
            return sum(Math.min(a,b), Math.max(a,b));
        }
        private long sum (long a, long b){
            return ((b-a+1) * (b+a)) / 2; // 등차수열 합 공식
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3,5));
    }
}
