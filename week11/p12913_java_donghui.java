package week11;

import java.util.Arrays;

public class p12913_java_donghui {
    int solution(int[][] land) {

        int[][] arr = new int[land.length][4];
        arr[0][0] = land[0][0];
        arr[0][1] = land[0][1];
        arr[0][2] = land[0][2];
        arr[0][3] = land[0][3];

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;

                    arr[i][j] = Math.max(arr[i][j], arr[i - 1][k] + land[i][j]);
                }
            }
        }
        int[] ans = new int[4];

        for (int k = 0; k < 4; k++) {
            ans[k] = arr[land.length - 1][k];
        }

        Arrays.sort(ans);

        int answer = ans[3];

        return answer;
    }
}
