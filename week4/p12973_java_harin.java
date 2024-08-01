package week4;
import java.util.*;

/**
 * lv 2
 * 짝지어 제거하기
 * b aa baa → bb aa → aa →
 * 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
 * baabaa	1
 * cdcd	0
 */
public class p12973_java_harin {
    static class Solution
    {
        public int solution(String s)
        {
            Stack<Character> stack = new Stack<>();
            for (int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if (stack.isEmpty()) stack.push(c); // 스택이 비어있으면 짝지을 일 없으니 push
                else {
                    if (stack.peek() == c) stack.pop(); // peek에 현재 문자가 있으면 pop
                    else stack.push(c); // 짝지을 수 없으면 push
                }
            }
            return stack.empty() ? 1 : 0; // 비어있으면 1 아니면 0
        }
    }
}
