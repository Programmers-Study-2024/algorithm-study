package week4;
/**
 * lv 1
 * 가운데 글자 가져오기
 */
public class p12903_java_harin {
    static class Solution {
        public String solution(String s) {
            String result="";
            int len = s.length();

            if (len % 2 == 0) {
                result += s.charAt(len/2 - 1);
                result += s.charAt(len/2);
            } else {
                result += s.charAt(len/2);
            }

            return result;
        }
    }
}
