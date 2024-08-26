package week8;
import java.util.*;
/**
 * lv 2
 * [1차] 캐시
 * 1. LRU 알고리즘 (가장 오래된거 교체)
 * 2. hit:1, miss:5
 * 3. 대소문자 구분 안함
 * -----
 * J|P|S
 * -----
 */
public class p17680_java_harin {
    class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            ArrayList<String> arr = new ArrayList<>();
            if (cacheSize == 0) return cities.length*5;
            for (String s : cities){
                s = s.toUpperCase();
                // hit
                if (arr.contains(s)){
                    arr.remove(s); // 기존 삭제 후
                    arr.add(s); // 뒤에 추가
                    answer += 1;
                }
                // miss
                else {
                    if (arr.size() == cacheSize){ // 캐시 다 찼을 경우
                        arr.remove(0); // 제일 앞 지우기
                    }
                    arr.add(s);
                    answer += 5;
                }

            }
            return answer;
        }
    }
}
