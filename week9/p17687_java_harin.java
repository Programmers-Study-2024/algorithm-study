package week9;
/**
 * lv 2
 * [3차] n진수 게임
 */
public class p17687_java_harin {
    class Solution {
        public String solution(int n, int t, int m, int p) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            int num=0, len = t*m;

            // n진수 변환
            while(sb.length() < len){
                // 16진수일 때는 A~F 소문자로 나와서 대문자로 변환해줘야함
                String tmp = Integer.toString(num, n).toUpperCase();
                sb.append(tmp);
                num++;
            }

            // len 길이만큼 사용
            String str = sb.substring(0, len);

            // p번째부터 m번째마다 읽어줌
            for(int i=p-1; i<str.length(); i+=m){
                char ch = str.charAt(i);
                answer += ch;
            }
            return answer;
        }
    }
}
