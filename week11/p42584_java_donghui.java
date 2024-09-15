package week11;

import java.util.Stack;

public class p42584_java_donghui {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();       //

        for (int i = prices.length - 1; i >= 0; i--) {
            int p = prices[i];
            while (!stack.isEmpty()) {

                if (prices[stack.peek()] >= prices[i]) break;

                int idx = stack.pop();

                answer[i] = prices.length - 1 - idx;

            }

            stack.push(i);

        }
        // stack 에 남아있는 수들은 자신보다 작은 수가 없는 것들!
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - 1 - index;
        }

        return answer;
    }

}
