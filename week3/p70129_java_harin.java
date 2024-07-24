package week3;
/**
 * lv 2
 * 이진 변환 반복하기
 * x의 모든 0을 제거합니다.
 * x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
 * 예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
 * 입력 : "110010101001"
 * 출력 : [3,8]
 */
public class p70129_java_harin {
    static class Solution {
        static int zero = 0;
        static int count = 0;

        public int[] solution(String s) {
            convert(s);
            int[] answer = {count, zero};
            return answer;
        }

        private void convert(String s) {
            count ++;
            int len = 0;
            for (char c: s.toCharArray()){
                if (c == '1') len ++; // 0 제거후 길이
                else zero++; // 제거할 0의 개수
            }
            if (len == 1) return; // 이진 변환 결과 1이면 종료
            s = Integer.toBinaryString(len); // 2진수 변환 함수
            convert(s); // 재귀함수
        }
    }

    static public void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("110010101001"));
    }
}
