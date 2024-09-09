package week10;
import java.util.*;
/**
 * lv2
 * 뒤에 있는 큰 수 찾기
 */
public class p154539_java_harin {
    /**
     * 스택으로 풀어야 시간초과가 안난다
     */
    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            Stack<Integer> stack = new Stack<>();
            int idx = 0;

            // 배열을 역순으로 순회하면서 뒷 큰 수를 찾음
            for (int i = numbers.length - 1; i >= 0; i--) {
                // 스택에 있는 값들이 현재 숫자보다 작으면 pop
                while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                    stack.pop();
                }

                // 스택이 비어 있으면 뒷 큰 수가 없으므로 -1
                if (stack.isEmpty()) {
                    answer[i] = -1;
                } else {
                    // 스택에 남아 있는 값 중 가장 가까운 큰 수가 뒷 큰수
                    answer[i] = stack.peek();
                }

                // 현재 숫자를 스택에 추가 (뒷 큰수가 될 수 있으므로)
                stack.push(numbers[i]);
            }

            return answer;
        }
    }

    /**
     * 리스트로 푸니까 O^n으로 테케 20~23에서 시간초과 발생
     */
    class BadSolution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            int idx = 0;

            for (int i=0; i<numbers.length; i++){
                long cnt = 0;
                for (int j=i; j<numbers.length; j++){
                    if (numbers[i] < numbers[j]){
                        answer[idx++] = numbers[j];
                        cnt++;
                        break;
                    } else continue;
                }
                if (cnt < 1) answer[idx++] = -1;
            }

            return answer;
        }
    }

}
