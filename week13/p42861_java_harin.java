package week13;
import java.util.*;
/**
 * lv 3
 * 섬 연결하기
 */
public class p42861_java_harin {
    class Solution {

        // 부모 노드를 찾는 함수
        public int findParent(int[] parent, int node) {
            if (parent[node] == node) return node;
            return parent[node] = findParent(parent, parent[node]);
        }

        // 두 노드를 같은 집합으로 합치는 함수
        public void unionParent(int[] parent, int a, int b) {
            int rootA = findParent(parent, a);
            int rootB = findParent(parent, b);
            if (rootA < rootB) parent[rootB] = rootA;
            else parent[rootA] = rootB;
        }

        public int solution(int n, int[][] costs) {
            // 1. 간선 비용을 기준으로 정렬
            Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));

            // 2. 각 섬의 부모 노드를 자기 자신으로 초기화
            int[] parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }

            int totalCost = 0;
            int edgesUsed = 0;

            // 3. 비용이 적은 간선부터 선택하여 트리를 구성
            for (int[] cost : costs) {
                int islandA = cost[0];
                int islandB = cost[1];
                int bridgeCost = cost[2];

                // 4. 두 섬이 같은 집합에 있지 않으면 다리 연결
                if (findParent(parent, islandA) != findParent(parent, islandB)) {
                    unionParent(parent, islandA, islandB);
                    totalCost += bridgeCost;
                    edgesUsed++;

                    // 모든 섬을 연결했으면 종료
                    if (edgesUsed == n - 1) break;
                }
            }

            return totalCost;
        }
    }
}
