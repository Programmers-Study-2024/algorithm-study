package week2;
import java.util.*;

/**
 * lv 2
 * 최댓값과 최솟값
 * stram api 사용하여 String 배열을 Integer 배열로 바꾼 후 최대최소 값 구했습니다.
 */
public class p12939_java_harin {
    static class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            String[] list = s.split(" "); // 공백 기준 문자열 배열 생성

            // 최댓값 추출
            int max = Arrays.stream(list)
                    .mapToInt(Integer::parseInt) // String[] to Integer[]
                    .max()
                    .getAsInt();
            // 최솟값 추출
            int min = Arrays.stream(list)
                    .mapToInt(Integer::parseInt) // String[] to Integer[]
                    .min()
                    .getAsInt();

            sb.append(min + " ");
            sb.append(max);
            return sb.toString();
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("1 2 3 4"));
    }
}
