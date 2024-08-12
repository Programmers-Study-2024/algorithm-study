package week6;

import java.util.Stack;

public class p76502_java_minsu {

    public static void main(String[] args) {
        
        //문제설명

        // 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

        // (), [], {} 는 모두 올바른 괄호 문자열입니다.
        // 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, 
        // ([]) 도 올바른 괄호 문자열입니다.
        // 만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로,
        //  {}([]) 도 올바른 괄호 문자열입니다.
        // 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 
        // 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 
        // return 하도록 solution 함수를 완성해주세요.

        String s = "[](){}";

        System.out.println(solution(s));
    }


    public static int solution(String s) {
        int answer = 0;

        // 문자열 길이만큼 반복
        for (int i = 0; i < s.length(); i++) {
            // 문자열을 왼쪽으로 i만큼 회전
            String rotate = s.substring(i) + s.substring(0, i);

            // 회전한 문자열이 올바른 괄호 문자열인지 확인
            if (isCorrect(rotate)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 열린 괄호는 스택에 추가
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // 닫힌 괄호가 나왔을 때 스택이 비어있거나 짝이 맞지 않으면 false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // 스택이 비어있으면 올바른 괄호 문자열
        return stack.isEmpty();
    }

}
