package week7;
import java.util.*;
/**
 * lv 2
 * H-Index
 */
public class p42747_java_harin {
    class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);
            int len = citations.length;
            for (int i = 0; i < len; i++) {
                // 현재 인용 횟수가 전체 길이에서 i를 뺀 값보다 크거나 같은 경우, H-Index 가능성
                if (citations[i] >= len - i) {
                    return len - i;  // H-Index 반환
                }
            }

            return 0;
        }
    }
}
