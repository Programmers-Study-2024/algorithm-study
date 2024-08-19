package week7;
import java.util.*;

/**
 * lv 2
 * 의상
 */
public class p42578_java_harin {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;

            HashMap<String, Integer> map = new HashMap<>();
            for(String[] clo : clothes) {
                if (map.containsKey(clo[1])) {
                    map.put(clo[1], map.get(clo[1])+1);
                }
                else {
                    map.put(clo[1],2);
                }
            }

            for(String y : map.keySet()){
                answer *= map.get(y);
            }
            answer -= 1;
            return answer;
        }
    }
}
