package week11;

public class p49993_java_donghui {



    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int solution(String dirs) {

        // 내 중심을 5,5로 생각
        int[][] map = new int[11][11];
        boolean[][][] visited = new boolean[11][11][4];       // 상하좌우 판별

        int answer = solve(dirs, map, visited, 5, 5);


        return answer;
    }

    static int solve(String dirs, int[][] map, boolean[][][] visited, int x, int y) {
        int count = 0;
        int idx = 0;
        for (char c : dirs.toCharArray()) {
            if (c == 'U') idx = 0;
            else if (c == 'D') idx = 1;
            else if (c == 'R') idx = 2;
            else if (c == 'L') idx = 3;

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;

            int reverseIdx = 0;
            if (idx == 1 || idx == 3) {
                reverseIdx = idx - 1;
            } else {
                reverseIdx = idx + 1;
            }

            if (!visited[x][y][idx] && !visited[nx][ny][reverseIdx]) {
                visited[x][y][idx] = true;
                visited[nx][ny][reverseIdx] = true;
                count++;
                // System.out.print(c+" ");
            }
            // 다음칸으로 이동
            x = nx;
            y = ny;
        }
        return count;
    }

}