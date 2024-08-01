package week4;
import java.util.*;
/**
 * lv 1
 * 나누어 떨어지는 숫자 배열
 */
public class p12910_java_harin {
    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] res = Arrays.stream(arr)
                    .filter(n -> n % divisor == 0)
                    .sorted()
                    .toArray();
            if (res.length == 0) {
                res = new int[]{-1};
            }
            return res;
        }
    }
}
