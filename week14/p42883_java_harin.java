package week14;
import java.util.*;
/**
 * lv 2
 * 큰 수 만들기
 */
public class p42883_java_harin {
    class Solution {
        public String solution(String number, int k) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < number.length(); i++) {
                char num = number.charAt(i);
                // Stack이 비어 있으면 바로 push
                while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
                    stack.pop();  // 스택의 마지막 요소가 현재 num보다 작을 때 pop
                    k--;
                }
                stack.push(num);  // 현재 num을 스택에 push
            }

            // k가 남아있으면 뒤에서 k개 만큼 제거
            while (k > 0) {
                stack.pop();
                k--;
            }

            // Stack을 문자열로 변환
            StringBuilder answer = new StringBuilder();
            for (char c : stack) {
                answer.append(c);
            }

            return answer.toString();
        }
    }
}
