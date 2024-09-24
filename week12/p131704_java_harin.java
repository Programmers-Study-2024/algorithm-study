package week12;
import java.util.*;
/**
 * lv 2
 * 택배상자
 * 스택 쓸 생각을 못하고 계속 헤매다가 품..
 */
public class p131704_java_harin {
    class Solution {
        public int solution(int[] order) {
            Stack<Integer> stack = new Stack<>();
            int idx=0;
            int answer = 0;

            for (int i=1; i<=order.length; i++){
                stack.push(i);
                while(!stack.isEmpty() && order[idx] == stack.peek()){
                    stack.pop();
                    answer++;
                    idx++;
                }
            }
            return answer;
        }
    }
}
