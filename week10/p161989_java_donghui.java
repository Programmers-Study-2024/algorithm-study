package week10;

public class p161989_java_donghui {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n + 1];

        for (int sec : section) {
            wall[sec] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (wall[i]) {
                i = i + m - 1;
                answer++;
            }
        }


        return answer;
    }
}
