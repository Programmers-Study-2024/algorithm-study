package week12;
/**
 * lv 1
 * 3진법 뒤집기
 */
public class p68935_java_harin {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String s = Integer.toString(n, 3);
            String tmp ="";
            for (int i=(s.length())-1; i>=0; i--){
                tmp += s.charAt(i);
            }
            return Integer.parseInt(tmp, 3);
        }
    }
}
