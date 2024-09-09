package week10;
import java.util.*;

/**
 * lv 2
 * 게임 맵 최단거리
 * ** 코드 참고함. dfs 연습을 더 하자
 */
public class p1844_java_harin {
    class Solution {
        static int[] dx = {1, 0, -1, 0};
        static int[] dy = {0, 1, 0, -1};

        public int solution(int[][] maps) {
            int answer = 0;
            int[][] visited = new int[maps.length][maps[0].length];
            bfs(maps, visited);
            answer = visited[maps.length-1][maps[0].length-1];
            if (answer == 0) return -1;
            return answer;
        }

        private static void bfs(int[][] maps, int[][] visited){
            int x = 0; int y = 0;
            visited[x][y] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x, y});

            while(!queue.isEmpty()){
                int[] curr = queue.poll();
                int cx = curr[0];
                int cy = curr[1];

                for (int i=0; i<4; i++){
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];
                    if (nx < 0 || nx > maps.length-1 || ny < 0 || ny > maps[0].length - 1) continue;
                    if (visited[nx][ny] == 0 && maps[nx][ny] == 1){
                        visited[nx][ny] = visited[cx][cy] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
