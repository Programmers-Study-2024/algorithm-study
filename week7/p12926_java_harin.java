package week7;
/**
 * lv 1
 * 시저 암호
 * a 97 z 122
 * A 65 Z 90
 */
public class p12926_java_harin {
    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for (char ch : s.toCharArray()){
                if (ch == ' ') answer += ' ';
                else if (ch >= 97 && ch <= 122) answer += (char) ('a' + (ch + n - 'a') % 26);
                else answer += (char) ('A' + (ch + n - 'A') % 26);
            }
            return answer;
        }
    }
}
