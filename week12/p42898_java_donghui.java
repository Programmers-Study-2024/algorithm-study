package week12;

public class p42898_java_donghui {

    static int[][] map;

    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        map = new int[n + 1][m + 1];
        for (int[] p : puddles) {
            map[p[1]][p[0]] = -1;
        }

        map[1][1] = 1;
        answer = road(n, m);


        return answer;
    }

    static int road(int n, int m) {
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= m; y++) {
                if (map[x][y] == -1) {
                    map[x][y] = 0;          // 물 웅덩이 만났을 때
                } else
                    map[x][y] = (map[x - 1][y] + map[x][y - 1]) % 1000000007;


            }

        }

        return map[n][m];

    }
}
