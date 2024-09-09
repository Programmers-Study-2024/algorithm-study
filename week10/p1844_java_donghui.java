package week10;

import java.util.LinkedList;
import java.util.Queue;

public class p1844_java_donghui {
    static boolean[][] visited;
    static int max = -1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public int solution(int[][] maps) {
        int answer = 0;

        visited = new boolean[maps.length][maps[0].length];
        // 최단거리찾기
        bfs(maps, 0, 0, maps.length - 1, maps[0].length - 1);

        return max;
    }

    static void bfs(int[][] maps, int x, int y, int endX, int endY) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{x, y, 1});

        boolean flag = false;
        while (!q.isEmpty() && !flag) {
            int[] arr = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];

                if (nx < 0 || nx > endX || ny < 0 || ny > endY) continue;
                if (visited[nx][ny]) continue;
                if (maps[nx][ny] == 0) continue;

                if (nx == endX && ny == endY) {
                    flag = true;
                    max = arr[2] + 1;
                    break;
                }

                visited[nx][ny] = true;

                q.add(new int[]{nx, ny, arr[2] + 1});

            }
        }


    }

}
