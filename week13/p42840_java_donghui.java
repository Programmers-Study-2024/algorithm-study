package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class p42840_java_donghui {
    public int[] solution(int[] answers) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];

            if (arr1[i % 5] == ans) correct[0]++;
            if (arr2[i % 8] == ans) correct[1]++;
            if (arr3[i % 10] == ans) correct[2]++;
        }

        int[] tmp = correct.clone();
        Arrays.sort(tmp);
        int maxSum = tmp[2];


        PriorityQueue<GiveUp> gu = new PriorityQueue<>();
        ArrayList<Integer> giveUp = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            if (maxSum == 0) {                      // 전체가 다 틀렸을 때
                giveUp.add(j);
            } else {
                gu.add(new GiveUp(j + 1, correct[j]));
            }
        }

        int max = 0;
        while (!gu.isEmpty()) {
            GiveUp math = gu.poll();
            if (math.num == 0) continue;
            if (max <= math.num) {
                giveUp.add(math.idx);
                max = math.num;
            }

        }

        int[] answer = new int[giveUp.size()];

        for (int k = 0; k < giveUp.size(); k++) answer[k] = giveUp.get(k);


        return answer;
    }
}

class GiveUp implements Comparable<GiveUp> {
    int idx;
    int num;

    public GiveUp(int idx, int num) {
        this.idx = idx;
        this.num = num;
    }

    @Override
    public int compareTo(GiveUp gu) {
        if (gu.num == this.num) return this.idx - gu.idx;
        return gu.num - this.num;
    }


}

