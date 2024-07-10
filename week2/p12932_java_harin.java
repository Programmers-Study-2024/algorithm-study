package week2;
import java.util.*;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class p12932_java_harin {
    static class Solution {
        public int[] solution(long n) {
            String s = String.valueOf(n); // long to String
            int[] answer = new int[s.length()]; // int 배열 만들기
            for (int i=0; i < answer.length; i++){
                answer[i] = Integer.parseInt(s.substring(answer.length-i-1, answer.length-i)); // substring으로 문자열 잘라서 int 배열에 넣어주기
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(12345)));
    }
}
