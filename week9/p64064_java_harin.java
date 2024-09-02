package week9;
import java.util.*;

/**
 * lv 3
 * 불량 사용자
 * ** 다시 풀어보기
 */
public class p64064_java_harin {
    class Solution {
        public int solution(String[] user_id, String[] banned_id) {

            Set<Set<String>> set = new HashSet<>();
            Set<String> answer = new HashSet<>();
            dfs(user_id, banned_id, set, answer, 0);

            return set.size();
        }

        public void dfs(String[] user_id, String[] banned_id, Set<Set<String>> set, Set<String> answer, int depth) {

            if(depth == banned_id.length) {
                set.add(new HashSet<>(answer));
                return;
            }

            for(int i = 0 ; i < user_id.length ; i++) {

                if(user_id[i].matches(banned_id[depth].replace("*",".")) && !answer.contains(user_id[i])){

                    answer.add(user_id[i]);
                    dfs(user_id, banned_id, set, answer, depth+1);
                    answer.remove(user_id[i]);
                }
            }
        }
    }
}
