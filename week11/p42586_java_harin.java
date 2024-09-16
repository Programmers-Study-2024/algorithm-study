package week11;
import java.util.*;
/**
 * 고득점 kit - 스택/큐
 *  기능개발
 */
public class p42586_java_harin {

    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            ArrayList<Integer> arr = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();

            // 작업 일수 큐에 담음
            for (int i=0; i<progresses.length; i++) {
                queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
            }

            while (!queue.isEmpty()){
                int minDays = queue.poll();
                int count = 1;
                while (!queue.isEmpty() && queue.peek() <= minDays){
                    queue.poll();
                    count++;
                }
                arr.add(count);
            }

            int[] answer = new int[arr.size()];
            for (int i=0; i<arr.size(); i++){
                answer[i] = arr.get(i);
            }

            return answer;
        }
    }
}
