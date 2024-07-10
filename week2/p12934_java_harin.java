package week2;
import java.util.*;

/**
 * 정수 제곱근 판별
 * 정수 제곱근을 1로 나눴을 때 나머지가 0이면 제곱근, 0이 아니면 제곱근이 아닌 것으로 풀이했습니다.
 */
public class p12934_java_harin {
    static class Solution {
        public long solution(long n) {
            return ((Math.sqrt(n) % 1) == 0) ? (long) Math.pow(Math.sqrt(n)+1, 2) : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(121));
    }
}
