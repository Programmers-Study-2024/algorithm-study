package week13;

import java.util.Arrays;

public class p86491_java_donghui {
    public int solution(int[][] sizes) {
        int answer = 0;


        for (int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            if (a > b) {
                sizes[i][1] = a;
                sizes[i][0] = b;
            }
        }

        int[] size1 = new int[sizes.length];
        int[] size2 = new int[sizes.length];
        for (int j = 0; j < sizes.length; j++) {
            size1[j] = sizes[j][0];
            size2[j] = sizes[j][1];
        }

        Arrays.sort(size1);
        Arrays.sort(size2);

        answer = size1[size1.length - 1] * size2[size2.length - 1];


        return answer;
    }
}
