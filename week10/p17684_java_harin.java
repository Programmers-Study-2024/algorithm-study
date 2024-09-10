package week10;
import java.util.*;
/**
 * lv 2
 * [3차] 압축
 */
public class p17684_java_harin {
    class Solution {
        public int[] solution(String msg) {
            // 사전 초기화
            Map<String, Integer> dictionary = new HashMap<>();
            List<Integer> answer = new ArrayList<>();

            // 사전 초기화 (A~Z까지)
            int dictSize = 26;
            for (int i = 0; i < 26; i++) {
                dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
            }

            // LZW 압축 구현
            String w = "";
            int index = 27; // 사전 추가 인덱스 시작은 27
            for (int i = 0; i < msg.length(); i++) {
                String c = String.valueOf(msg.charAt(i));
                String wc = w + c;

                if (dictionary.containsKey(wc)) {
                    w = wc;
                } else {
                    // 사전에 없는 경우
                    answer.add(dictionary.get(w));
                    dictionary.put(wc, index++);
                    w = c;
                }
            }

            // 마지막 남은 문자열 처리
            if (!w.equals("")) {
                answer.add(dictionary.get(w));
            }

            // 리스트를 배열로 변환하여 반환
            int[] ans = new int[answer.size()];
            for (int i = 0; i < answer.size(); i++) {
                ans[i] = answer.get(i);
            }
            return ans;
        }
    }
}
