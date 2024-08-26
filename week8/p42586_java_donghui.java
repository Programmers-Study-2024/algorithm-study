package week8;

import java.util.ArrayList;

public class p42586_java_donghui {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] day = new int[speeds.length];

        // 각 progresses 마다 며칠만에 작업이 끝나는지 확인
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];

            day[i] = (100 - progress) / speed;

            if ((100 - progress) % speed != 0) day[i] += 1;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        // 앞에서부터 몇 개의 기능이 배포되는지 확인
        int lt = 0;
        int rt = 1;
        int count = 1;              // 배포되는 기능의 수
        while (true) {
            if (day[lt] < day[rt]) {
                arr.add(count);
                lt = rt;
                count = 1;
            } else {
                count++;
            }
            rt++;
            if (rt >= day.length) {
                arr.add(count);
                break;
            }

        }

        int[] answer = new int[arr.size()];

        for (int k = 0; k < arr.size(); k++) {
            answer[k] = arr.get(k);
        }

        return answer;
    }
}
