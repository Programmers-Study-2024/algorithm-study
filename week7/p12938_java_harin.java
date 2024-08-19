package week7;
import java.util.*;
/**
 * lv 3
 * 최고의 집합
 */
public class p12938_java_harin {
    class Solution {
        public int[] solution(int n, int s) {
            int[] answer = new int[n];

            if (n>s) return new int[]{-1};

            for(int i=0; i<n; i++){
                answer[i] = s/n;
            }

            for(int i=0; i<s%n; i++){
                answer[i] ++; // 나머지를 1씩 더해주기
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
