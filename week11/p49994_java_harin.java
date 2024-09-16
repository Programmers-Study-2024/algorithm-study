package week11;
import java.util.*;
/**
 * lv 2
 * 방문 길이
 */
public class p49994_java_harin {
    class Solution {
        public int solution(String dirs) {
            int x = 0;
            int y = 0;

            // 방문한 경로를 저장
            Set<String> visitedPaths = new HashSet<>();

            for (char dir : dirs.toCharArray()) {
                int nextX = x;
                int nextY = y;

                if (dir == 'U' && y < 5) nextY++;
                else if (dir == 'D' && y > -5) nextY--;
                else if (dir == 'R' && x < 5) nextX++;
                else if (dir == 'L' && x > -5) nextX--;

                // 경계 밖을 벗어나지 않은 경우에만 경로를 기록
                if (nextX != x || nextY != y) {
                    // 경로 저장: 양방향으로 저장
                    String path1 = x + "" + y + "" + nextX + "" + nextY;
                    String path2 = nextX + "" + nextY + "" + x + "" + y;
                    visitedPaths.add(path1);
                    visitedPaths.add(path2);

                    // 좌표 갱신
                    x = nextX;
                    y = nextY;
                }
            }

            // 방문한 길의 길이를 반환 (양방향 저장이므로 절반으로 나눔)
            return visitedPaths.size() / 2;
        }
    }
}
