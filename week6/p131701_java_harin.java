package week6;
import java.util.*;
/**
 * lv 2
 * 연속 부분 수열 합의 개수
 * 1 1 4 7 9
 * - 길이 1 : 1, 4, 7, 9
 * - 길이 2 : 2, 5, 10, 11, 16
 * - 길이 3 : 6, 11, 12, 17, 20
 */
public class p131701_java_harin {
    class Solution {
        public int solution(int[] elements) {
            HashSet<Integer> set = new HashSet<Integer>();
            int len = elements.length;
            for (int i=0; i<len; i++){
                int sum = 0;
                for (int j=i; j<i+len; j++){
                    int idx = j%len;
                    sum += elements[idx];
                    set.add(sum);
                }
            }
            return set.size();
        }
    }
}
