package week4;

import java.util.Stack;

public class p12973_java_minsu {

    public static void main(String[] args) {
        
        //문제설명
        // 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 
        // 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 그다음, 그 둘을 제거한 뒤, 
        // 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다. 
        // 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 
        // 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.

        // 예를 들어, 문자열 S = baabaa 라면

        // b aa baa → bb aa → aa →

        // 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.

        String s = "baabaa";

        int answer = 0;

        if(s.length() % 2 != 0) {
            answer = 0;
        } else {
            for(int i=0; i<s.length(); i++) {
                if(i == s.length()-1) {
                    answer = 0;
                    break;
                }
                if(s.charAt(i) == s.charAt(i+1)) {
                    s = s.substring(0, i) + s.substring(i+2, s.length());
                    i = -1;
                }
            }
            if(s.length() == 0) {
                answer = 1;
            }
        }

        // return answer;


    }

    public static void goodSoulution(String[] args) {
        
        String s = "baabaa";
        
        // 문자를 저장할 스택
        Stack<Character> stack = new Stack<>();

        // 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) { // 스택이 비어있다면 현재 문자를 스택에 추가
                stack.push(s.charAt(i));
            } else {
                char ch = s.charAt(i); // 현재 문자

                // 스택의 맨 위 문자와 현재 문자가 같다면 스택에서 제거
                if (stack.peek() == ch) {
                    stack.pop();
                // 같지 않다면 현재 문자를 스택에 추가
                } else {
                    stack.push(ch);
                }
            }
        }
        
        // return stack.isEmpty() ? 1 : 0;

    }

}
