package week1;
/**
 * 문자열 내 p와 y의 개수
 */
public class p12916_java_harin {
    static class Solution {
        public boolean solution(String s) {
            int pctn = 0;
            int yctn = 0;
            boolean answer = true;
            s = s.toLowerCase(); // 소문자 변환

            for (char x: s.toCharArray()){ // 문자 분리하여 배열 만들어줌
                if (x=='p') pctn++;
                else if (x=='y') yctn++;
            }
            answer = (pctn == yctn) ? true : false;

            return answer;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("pPoooyY"));
    }
}
