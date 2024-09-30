package week13;
/**
 * lv 2
 * 피로도
 */
public class p87946_java_harin {
    class Solution {
        static boolean[] visited;
        static int max = 0;

        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            explore(dungeons, k, 0);
            return max;
        }

        private void explore(int[][] dungeons, int k, int count){
            max = Math.max(max, count);
            for (int i=0; i<dungeons.length; i++){
                System.out.println("i : " + i);
                if (dungeons[i][0] <= k && !visited[i]) {
                    visited[i] = true;
                    explore(dungeons, k-dungeons[i][1], count+1);
                    visited[i] = false;
                }
            }
        }
    }
}
