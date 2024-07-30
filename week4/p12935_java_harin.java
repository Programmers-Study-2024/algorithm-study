package week4;
import java.util.*;
/**
 * lv 1
 * 제일 작은 수 제거하기
 */
public class p12935_java_harin {
    static class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                int[] ans = {-1};
                return ans;
            }
            int min = Arrays.stream(arr)
                    .min()
                    .getAsInt();

            int answer[] = Arrays.stream(arr)
                    .filter(n -> n!=min)
                    .toArray();

            return answer;
        }
    }
}
