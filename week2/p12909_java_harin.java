package week2;
import java.util.*;

/**
 * 올바른 괄호
 * () 쌍이 올바르다면, ( 인 경우 push, ) 인 경우 pop 했을 때 최종 스택이 비어있어야 합니다.
 */
public class p12909_java_harin {
    static class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>(); // Character로 스택 생성

            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if (stack.isEmpty()) return false; // 스택이 비어있을 경우 pop 하지 말고 return false
                    stack.pop();
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
       Solution s = new Solution();
        System.out.println(s.solution("()()"));
    }
}
