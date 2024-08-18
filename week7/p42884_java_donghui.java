package week7;

import java.util.Arrays;
import java.util.Comparator;

public class p42884_java_donghui {

    public int solution(int[][] routes) {
        int answer = 1;

        // 정렬
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        // 기준선 : 끝 지점으로 하되, 기준 점이 뒤의 첫 지점과 겹치지 않으면 카메라 추가 + 기준점 바꾸기
        int camera = routes[0][1];

        for (int i = 1; i < routes.length; i++) {
            int start = routes[i][0];
            int end = routes[i][1];

            if (start > camera) {
                answer++;
                camera = end;
            }

        }

        return answer;
    }
}
