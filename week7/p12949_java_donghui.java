package week7;

public class p12949_java_donghui {
    // 14      33            2X3 , 2X2
    // 32      33
    // 41
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }

                answer[i][j] = sum;
            }

        }
        return answer;
    }
}
