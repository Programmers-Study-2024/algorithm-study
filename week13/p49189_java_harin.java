package week13;
import java.util.*;
/**
 * lv 3
 * 가장 먼 노드
 * 이해 잘 안됨..
 */
public class p49189_java_harin {
    class Solution {
        public int solution(int n, int[][] edge) {
            int answer = 0;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            int[] distance = new int[n+1]; // 간선 거쳐간 개수
            boolean[] visited = new boolean[n+1];
            Queue<Integer> queue = new LinkedList<>();

            for (int i=0; i<n+1; i++){
                graph.add(new ArrayList<>());
            }
            for (int i=0; i<edge.length; i++){
                graph.get(edge[i][0]).add(edge[i][1]);
                graph.get(edge[i][1]).add(edge[i][0]);
            }
            visited[1] = true;
            queue.add(1);
            while(!queue.isEmpty()){
                int x = queue.poll();
                ArrayList<Integer> node = graph.get(x);
                for(int i=0; i <node.size(); i++) {
                    if (visited[node.get(i)] == false) {
                        queue.add(node.get(i));
                        visited[node.get(i)] = true;
                        distance[node.get(i)] = distance[x] + 1;
                    }
                }
            }
            Arrays.sort(distance);
            int max = distance[distance.length-1];
            for(int i = distance.length-1; distance[i] == max; i--)
                answer++;
            return answer;
        }
    }
}
