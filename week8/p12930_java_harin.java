package week8;
/**
 * lv 1
 * 이상한 문자 만들기
 * "try hello world" "TrY HeLlO WoRlD"
 * 공백 기준 단어별로 짝수 대문자 홀수 소문자
 */
public class p12930_java_harin {
    class Solution {
        public String solution(String s) {
            int index = 0;
            String answer = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    answer += c;
                    index = 0; // 공백을 만나면 인덱스 초기화
                } else {
                    answer += (index % 2==0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                    index++;
                }
            }
            return answer;
        }
    }
}
