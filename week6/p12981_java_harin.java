package week6;
import java.util.*;
/**
 * lv 2
 * 영어 끝말잇기
 * 1. 같은 단어 말했을 때 탈락 -> set에 집어넣고 length 비교해서 같으면 탈락
 * 2. 단어의 마지막 != 다음 단어의 처음 일 때 탈락
 */
public class p12981_java_harin {
    class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            Set<String> set = new HashSet<>();
            set.add(words[0]);

            for (int i=1; i<words.length; i++){
                int len = set.size();
                set.add(words[i]);
                // 같은 단어 나왔을 경우
                if (len == set.size()){
                    answer[0] = (i%n) + 1;
                    answer[1] = (i/n) + 1;
                    break;
                }
                // 이전 단어의 끝글자랑 현재 단어의 앞글자가 다를 경우
                if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                    answer[0] = (i%n) + 1;
                    answer[1] = (i/n) + 1;
                    break;
                }
            }
            return answer;
        }
    }
}
