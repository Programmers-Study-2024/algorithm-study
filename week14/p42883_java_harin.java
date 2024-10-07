package week14;
import java.util.*;
/**
 * lv 2
 * 큰 수 만들기
 */
public class p42883_java_harin {
    class Solution {
        public String solution(String number, int k) {
            String answer = "";
            Stack<Integer> stack = new Stack<>();
            for (int i=0; i<number.length(); i++){
                int num = Integer.parseInt(number.substring(i,i+1));
                if (stack.isEmpty()){
                    stack.push(num);
                    continue;
                }
                if (k > 0){
                    while (stack.peek() < num){
                        stack.pop();
                        k -= 1;
                        if (stack.isEmpty() || k<=0) break;
                    }
                }
                stack.push(num);
            }
            for (int i : stack){
                answer += i;
            }
            return answer;
        }
    }
}
