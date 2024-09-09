package week10;

import java.util.Arrays;
import java.util.Stack;

public class p154539_java_donghui {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 2; i >= 0; i--) {
            stack.push(numbers[i + 1]);
            if (numbers[i] < numbers[i + 1]) {
                answer[i] = numbers[i + 1];
            } else if (numbers[i] < answer[i + 1]) {
                answer[i] = answer[i + 1];
            } else {
                while (!stack.isEmpty()) {
                    if (numbers[i] < stack.peek()) {
                        answer[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                    }
                }


            }

        }

        return answer;
    }
}
