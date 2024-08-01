package week4;
/**
 * lv 3
 * 네트워크
 * n	computers	return
 * 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
 * 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
 */
public class p43162_java_harin {
    static class Solution {
        static boolean[] visited;
        public int solution(int n, int[][] computers) {
            int answer = 0;
            visited = new boolean[n];

            for (int i=0; i<n; i++){
                if (!visited[i]){ // 방문하지 않은 노드 찾기
                    dfs(i, computers, visited); // dfs로 인접 노드들은 다 방문처리
                    answer += 1; // 네트워크 개수
                }
            }

            return answer;
        }
        public void dfs(int node, int[][] computers, boolean[] visited){
            visited[node] = true; // 인접 노드 전부 방문 처리
            for (int i=0; i<computers[node].length; i++){
                if (computers[node][i] == 1 && !visited[i]){
                    dfs(i, computers, visited); // 재귀함수
                }
            }
        }
    }
}
