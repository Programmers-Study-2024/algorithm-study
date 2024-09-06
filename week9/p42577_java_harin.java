package week9;
import java.util.*;
/**
 * lv 2
 * 전화번호 목록
 */
public class p42577_java_harin {
    class Solution {
        public boolean solution(String[] phoneBook) {
            Map<String, Integer> map = new HashMap<>();

            //전화번호 hashmap에 넣기
            for (int i=0; i < phoneBook.length; i++){
                map.put(phoneBook[i], i);
            }

            // 접두사 체크
            for (int i=0; i<phoneBook.length; i++){
                for (int j=0; j<phoneBook[i].length(); j++){
                    if (map.containsKey(phoneBook[i].substring(0,j))) return false;
                }
            }

            return true;
        }
    }
}
