package week6;
import java.util.*;
/**
 * lv 1
 * 문자열 내림차순으로 배치하기
 * 1. String -> String[] 을 split 사용해서 변환해줌
 * 2. 내림차순 정렬 : Arrays.sort(arr, Collections.reverseOrder()); 까먹지말자!!
 */
public class p12917_java_harin {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split(""); // String to String[]
            Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
            for (String str : arr){
                answer += str;
            }
            return answer;
        }
    }
}
