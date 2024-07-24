package week3;
import java.util.*;
/**
 * lv 2
 * JadenCase 문자열 만들기
 */
public class p12951_java_harin {
    static class Solution {
        public String solution(String s) {
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s, " ", true); // 구획문자도 토큰으로 사용
            StringBuilder sb = new StringBuilder();

            while(st.hasMoreTokens()){
                String word = st.nextToken();
                if (word.length() == 0 ) {
                    sb.append(" ");
                } else {
                    sb.append(word.substring(0,1).toUpperCase() + word.substring(1)); // substring(1) : 1이후 모든 문자열 출력
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("3people unFollowed me"));
    }
}
