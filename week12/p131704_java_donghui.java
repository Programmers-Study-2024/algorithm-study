package week12;

import java.util.Stack;

public class p131704_java_donghui {
    public int solution(int[] order) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int idx = 0;
        for (int n = 1; n <= order.length; n++) {
            if (n == order[idx]) {
                answer++;
                idx++;
            } else {
                stack.push(n);
            }

            while (!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                answer++;
                idx++;
            }


        }
        return answer;
    }
}
