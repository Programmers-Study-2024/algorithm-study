package week7;

/**
 * lv 1
 * 숫자 문자열과 영단어
 */
public class p81301_java_harin {
    class Solution {
        public int solution(String s) {
            String[] arr = {"zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"};
            for (int i=0; i<10; i++){
                s = s.replace(arr[i], String.valueOf(i)); //s에 arr안의 문자열 -> 숫자로 바꾸기
            }
            return Integer.parseInt(s);
        }
    }
}
