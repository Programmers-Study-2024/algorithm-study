package week10;
import java.util.*;
/**
 * lv 1
 * 과일 장수
 */
public class p135808_java_harin {
    class Solution {
        public int solution(int k, int m, int[] score) {
            Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
            int answer = 0;
            Arrays.sort(arr, Collections.reverseOrder());
            for (int i=0; i<score.length; i++){
                if ((i+1) % m == 0){
                    answer += (arr[i] * m);
                }
            }

            return answer;
        }
    }
}
