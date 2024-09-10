package week10;

/**
 * lv 2
 * 모음사전
 */
public class p84512_java_harin {
    class Solution {
        public int solution(String word) {
            String str = "AEIOU";
            int[] nums = {781, 156, 31, 6, 1}; // 각 자리수의 가중치
            int answer = word.length();

            for (int i = 0; i < word.length(); i++) {
                int idx = str.indexOf(word.charAt(i));
                // 현재 문자의 가중치 * idx
                answer += nums[i] * idx;
            }

            return answer;
        }
    }
}
