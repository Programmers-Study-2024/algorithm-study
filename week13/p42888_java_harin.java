package week13;
import java.util.*;
/**
 * lv 2
 * 오픈채팅방
 * - 처음에 Leave 조건 시에 맵에서 삭제하도록 해서 틀렸는데, 나가는 기록도 있어야 하므로 continue 해주면 통과
 * - 전체 연산을 hashmap에 수행 후에 ArrayList로 map에서 뽑아낸 최종 값을 담아줌
 */
public class p42888_java_harin {
    class Solution {
        public String[] solution(String[] record) {
            HashMap<String, String> hm = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();
            for (String str : record){
                String[] com = str.split(" ");
                if (com[0].equals("Enter")) hm.put(com[1], com[2]);
                //if (com[0].equals("Leave")) hm.remove(com[1]);
                if (com[0].equals("Change")) hm.put(com[1], com[2]);
                // hm.forEach((k, v) -> System.out.println("key: " + k + " value : " + v));
            }

            for (String str : record){
                String[] com = str.split(" ");
                if (com[0].equals("Enter")){
                    list.add(hm.get(com[1])+"님이 들어왔습니다.");
                }
                if (com[0].equals("Leave")){
                    list.add(hm.get(com[1])+"님이 나갔습니다.");
                }
            }
            String[] answer = new String[list.size()];

            for (int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
