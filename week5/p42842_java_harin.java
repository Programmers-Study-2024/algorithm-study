package week5;
import java.util.*;
/**
 * lv 2
 * 카펫
 */
public class p42842_java_harin {
    /**
     * 타일 개수의 합의 약수의 경우를 세보자
     * 12 = (1,12) (2,6) (3,4) (4,3) (6,2) (12,1)
     * 고려해야할 조건
     *  1. 가로길이 >= 새로길이 => (4,3) (6,2) (12,1)
     *  2. (가로-2)*(세로-2) = yellow => => (4,3)
     *  풀긴 풀었는데 코드가 너무 더러움...
     */
    class Solution {
        public int[] solution(int brown, int yellow) {
            int sum = brown + yellow;
            int a = 0;
            int b = 0;
            int[] answer = new int[2];
            for (int i=1; i<(sum/2); i++){
                if (sum % i == 0) {
                    a = i;
                    b = sum/i;
                    int col = Math.max(a,b);
                    int row = Math.min(a,b);
                    if ((col-2) * (row-2) == yellow) {
                        answer[0] = col;
                        answer[1] = row;
                        return answer;
                    }
                }
            }

            return answer;
        }
    }
}
