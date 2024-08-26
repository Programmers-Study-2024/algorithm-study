package week8;
import java.util.*;
/**
 * lv 2
 * 튜플
 * 길이별로 배열 오름차순 정렬후 숫자 중복 없이 순서대로 리스트에 추가한 것이 답
 */
public class p64065_java_harin {
    class Solution {
        public int[] solution(String s) {
            // 1. 중괄호 제거 및 문자열 배열로 변환
            String[] arr = s.replaceAll("[{}]", " ").trim().split(" , ");

            // 2. 길이에 따라 배열 정렬
            Arrays.sort(arr, (a, b) -> a.length() - b.length());

            // 3. 결과를 저장할 리스트
            List<Integer> list = new ArrayList<>();

            for (String i : arr){
                String[] tmp = i.split(",");
                for (String num : tmp){
                    int number = Integer.parseInt(num);
                    // 4. 리스트에 없는 숫자만 추가
                    if (!list.contains(number)){
                        list.add(number);
                    }
                }
            }

            int[] answer = new int[list.size()];
            for (int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
