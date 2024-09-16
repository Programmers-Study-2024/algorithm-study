package week11;

import java.util.LinkedList;
import java.util.Queue;

public class p42583_java_donghui {
    //      다시한번 풀어봐야 할듯..
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        int sum = 0;
        while (idx < truck_weights.length) {

            if (q.size() == 0) {                 // 다리에 아무 트럭이 없을 때
                q.add(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
                answer++;
            } else if (q.size() == bridge_length) {              // 다리에 꽉찬 경우
                sum -= q.poll();
            } else if (sum + truck_weights[idx] <= weight) {      // 현재 다리에 있는 트럭 무게 + 다음 올라올 트럭 이 최대 무게보다 작을 때
                q.add(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
                answer++;
            } else {            // 더이상 다리위에 트럭 놓지 못할 때 그냥 없는 수인 0을 추가
                q.add(0);
                answer++;
            }
        }


        return answer + bridge_length;
    }
}
