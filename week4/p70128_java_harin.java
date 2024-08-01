package week4;
/**
 * lv 1
 * 내적
 */
public class p70128_java_harin {
    static class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            for (int i=0; i<a.length; i++){
                answer += a[i] * b[i];
            }
            return answer;
        }
    }

}
