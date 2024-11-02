package week14;
/**
 * lv 2
 * 조이스틱
 */
public class p42860_java_harin {
    class Solution {
        public int solution(String name) {
            int answer = 0;
            int len = name.length();
            int idx = 0;
            int move = len - 1;

            for (int i=0; i<len; i++){
                answer += Math.min(name.charAt(i)-'A', 'Z' - name.charAt(i) + 1);
                idx = i+1;
                // 연속되는 A 개수 확인
                while (idx < len && name.charAt(idx)=='A') idx++;
                move = Math.min(move, i*2+len-idx);
                move = Math.min(move, (len-idx)*2+i);
            }
            return answer+move;
        }
    }
}
