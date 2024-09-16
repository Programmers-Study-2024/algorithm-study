package week11;
import java.util.*;

/**
 * lv 2
 * 더 맵게
 */
public class p42626_java_harin {
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i=0; i<scoville.length; i++){
                queue.add(scoville[i]);
            }
            while(queue.peek()<K){
                if(queue.size() == 1){
                    return -1;
                }
                queue.add(queue.poll() + queue.poll()*2);
                answer++;

            }
            return answer;
        }
    }
}
