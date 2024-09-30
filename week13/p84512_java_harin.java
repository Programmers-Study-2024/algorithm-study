package week13;
/**
 * lv 2
 * 모음사전
 */
public class p84512_java_harin {
    class Solution {
        public int solution(String word) {
            String str = "AEIOU";
            int[] nums = {781, 156, 31, 6, 1}; // 각 자리수의 가중치 5^4+5^3+5^2+5^1+1
            int answer = word.length(); // 단어의 길이 더하기

            // 각 자리마다 해당 모음의 위치를 찾고 그 가중치만큼 더해준다
            for (int i = 0; i < word.length(); i++) {
                int idx = str.indexOf(word.charAt(i));
                // 현재 문자의 가중치 * idx
                answer += nums[i] * idx;
            }

            return answer;
        }
    }
}
