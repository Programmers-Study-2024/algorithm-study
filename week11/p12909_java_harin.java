package week11;
import java.util.*;
/**
 * 고득점 kit - 스택/큐
 * 올바른 괄호
 */
public class p12909_java_harin {
    class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
            }

            return stack.isEmpty();
        }
    }
}
