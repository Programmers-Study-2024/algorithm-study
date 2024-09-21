package week11;

import java.util.Collections;
import java.util.PriorityQueue;

public class p42587_java_donghui {
    public int solution(int[] priorities, int location) {
        int answer = 0;


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());    // 내림차순

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }


        boolean flag = false;
        while (!flag) {
            for (int j = 0; j < priorities.length; j++) {
                int pri = pq.poll();                            // 우선순위 높은거 꺼냄
                if (priorities[j] == pri) {                      // 배열안이랑 같을 때
                    answer++;

                    if (j == location) {
                        flag = true;
                        break;
                    }
                } else {
                    pq.add(pri);                                // 제일 높은 값이 배열값과 다를 때
                }
            }

        }

        return answer;
    }
}
