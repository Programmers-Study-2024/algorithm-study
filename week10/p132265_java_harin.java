package week10;
import java.util.*;
/**
 * lv 2
 * 롤케이크 자르기
 */
public class p132265_java_harin {
    class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            HashSet<Integer> set = new HashSet<>();
            Map<Integer, Integer> map1 = new HashMap<>(); //형
            Map<Integer, Integer> map2 = new HashMap<>(); //동생

            for (int i : topping){
                map2.put(i, map2.getOrDefault(i,0)+1); // 동생에게 전체 넣어주기
            }

            for (int i : topping){
                map1.put(i, map1.getOrDefault(i,0)+1);
                if (map2.get(i)-1 == 0) map2.remove(i); // 마지막 남은 한 개 가져갈 때
                else map2.put(i, map2.get(i)-1);
                if (map1.size() == map2.size()) answer++;
            }
            return answer;
        }
    }
}
