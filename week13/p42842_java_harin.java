package week13;
import java.util.*;
/**
 * lv 2
 * 카펫
 */
public class p42842_java_harin {
    class Solution {
        public int[] solution(int brown, int yellow) {
            ArrayList<Integer> list = new ArrayList<>();

            // yellow의 약수를 모두 구함
            for (int i = 1; i <= Math.sqrt(yellow); i++) {
                if (yellow % i == 0) {
                    list.add(i); // 약수 추가
                }
            }

            // 가능한 모든 가로, 세로 조합에 대해 검토
            for (int i = 0; i < list.size(); i++) {
                int h = list.get(i); // 세로는 약수 중 하나
                int w = yellow / h;   // 가로는 나머지 약수

                if (2 * (w + h) + 4 == brown) {
                    return new int[]{w + 2, h + 2};
                }
            }

            return new int[]{0};
        }
    }

}
