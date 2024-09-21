package week11;

import java.util.Comparator;
import java.util.PriorityQueue;

public class p42626_java_donghui {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Long> pq = new PriorityQueue<Long>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o1 - o2);
            }
        });

        for (Integer i : scoville) pq.add((long) i);

        // 1,3,8 실패 --> -1 처리해야함
        while (!pq.isEmpty()) {
            long sco = pq.poll();

            if (sco >= K) break;

            if (pq.isEmpty()) {
                answer = -1;
                break;
            }

            long mix = sco + (2 * pq.poll());

            pq.add(mix);

            answer++;
        }

        return answer;
    }
}
