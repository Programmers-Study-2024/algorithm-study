package week8;
import java.util.*;
/**
 * lv 2
 * 프로세스
 * - 우선순위 큐 사용해서 풀음
 */
public class p42587_java_harin {
    class Solution {
        public int solution(int[] priorities, int location) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // 높은 숫자가 우선순위
            int answer = 0;

            for (int i: priorities){
                queue.add(i);
            }

            while (!queue.isEmpty()){
                for (int i=0; i<priorities.length; i++){
                    if (priorities[i] == queue.peek()) { // 우선순위와 배열 값 일치 경우
                        queue.poll();
                        answer++;
                        if (i == location) return answer; // location 찾을 때 중단
                    }
                }
            }
            return answer;
        }
    }
}
