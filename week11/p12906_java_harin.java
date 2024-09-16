package week11;
import java.util.*;
/**
 * 고득점 kit - 스택/큐
 * 같은 숫자는 싫어
 */
public class p12906_java_harin {
    public class Solution {
        public int[] solution(int []arr) {
            Stack<Integer> stack = new Stack<>();
            for(int i : arr){
                if(stack.isEmpty()) stack.push(i);
                if(!stack.isEmpty() && stack.peek()!=i) stack.push(i);
            }
            int[] answer = new int[stack.size()];
            for (int i=stack.size()-1; i>=0; i--) answer[i] = stack.pop();

            return answer;
        }
    }
}
