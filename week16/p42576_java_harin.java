package week16;
import java.util.HashMap;

public class p42576_java_harin {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            //HashMap 생성
            HashMap<String, Integer> hashmap = new HashMap<>(); //key-참여자 : value-이름횟수

            //참여자 이름
            //값 : 이름 횟수
            for (String player : participant) hashmap.put(player, hashmap.getOrDefault(player, 0) + 1); //이름 hashmap에 존재 -> +1
            //완주자 이름
            for (String player : completion) hashmap.put(player, hashmap.get(player) - 1);//완주 -> -1

            for (String key : hashmap.keySet()) {
                if (hashmap.get(key) != 0){ //키 값 0 아닌 경우 -> 참여자 이름 저장
                    answer = key;
                }
            }
            return answer;
        }
    }
}
