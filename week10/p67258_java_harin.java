package week10;
import java.util.*;
/**
 * lv 3
 * 보석 쇼핑
 * ** 코드 참고함
 */
public class p67258_java_harin {
    class Solution {
        public int[] solution(String[] gems) {
            int[] answer = new int[2];
            Set<String> set = new HashSet<>(Arrays.asList(gems));
            HashMap<String, Integer> hm = new HashMap<>();
            int length = Integer.MAX_VALUE, start = 0;
            for (int end=0; end < gems.length; end++){
                hm.put(gems[end], hm.getOrDefault(gems[end], 0)+1);

                // start번 보석이 중복일 때 -> 보석 개수 줄이고, start 증가
                while(hm.get(gems[start]) > 1){
                    hm.put(gems[start], hm.getOrDefault(gems[start], 0) - 1);
                    start++;
                }

                if (hm.size() == set.size() && length > (end - start)){
                    length = end - start; // 최단구간 업데이트
                    answer[0] = start+1;
                    answer[1] = end +1;
                }
            }

            return answer;
        }
    }
}
