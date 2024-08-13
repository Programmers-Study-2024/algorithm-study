package week6;
import java.util.*;
/**
 * lv 2
 * 괄호 회전하기
 * "[](){}"	3
 * "}]()[{"	2
 * "[)(]"	0
 * "}}}"	0
 */
public class p76502_java_harin {
    class Solution {
        public int solution(String s) {
            Stack<Character> stack = new Stack<Character>();
            int count = 0;
            for (int i=0; i<s.length(); i++){
                for (int j=i; j<i+s.length(); j++){
                    char ch = s.charAt(j % s.length());
                    if (ch == '[' || ch == '(' || ch == '{'){
                        stack.push(ch);
                    } else if (stack.isEmpty()) {
                        stack.push('.');
                        break;
                    } else if (stack.peek() == '[' && ch == ']') {
                        stack.pop();
                    } else if (stack.peek() == '(' && ch == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    }
                }
                if (stack.isEmpty()) count++;
                stack.clear();
            }
            return count;
        }
    }
}
