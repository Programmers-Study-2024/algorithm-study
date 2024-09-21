package week11;

import java.util.Stack;

public class p12906_java_donghui {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i<arr.length;i++) {
            if(stack.peek() != arr[i]) stack.push(arr[i]);
        }


        int[] answer = new int[stack.size()];

        for(int j = answer.length-1;j>=0;j--) {

            answer[j] = stack.pop();
        }



        return answer;
    }
}
