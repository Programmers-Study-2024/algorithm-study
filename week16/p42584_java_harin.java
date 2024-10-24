package week16;
import java.util.*;
public class p42584_java_harin {
    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i <prices.length; i++) {
                while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                    answer[stack.peek()] = i - stack.peek(); // 해당 인덱스에서 가격이 유지된 기간
                    stack.pop();
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                answer[stack.peek()] = prices.length - stack.peek() - 1;
                stack.pop();
            }
            return answer;

        }
    }
}
