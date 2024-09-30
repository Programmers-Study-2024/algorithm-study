package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p49189_java_donghui {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> gragh = new ArrayList<>();

        for (int i = 0; i <= n; i++) gragh.add(new ArrayList<>());

        for (int j = 0; j < edge.length; j++) {
            int a = edge[j][0];
            int b = edge[j][1];

            gragh.get(a).add(b);
            gragh.get(b).add(a);
        }


        int[] dist = new int[n + 1];
        solve(gragh, dist);
        System.out.println(Arrays.toString(dist));

        Arrays.sort(dist);
        int max = dist[n];
        int answer = 1;
        for (int k = n - 1; k >= 0; k--) {
            if (max != dist[k]) break;
            answer++;
        }

        System.out.println(Arrays.toString(dist));
        return answer;
    }


    static void solve(ArrayList<ArrayList<Integer>> gragh, int[] dist) {
        boolean[] visited = new boolean[dist.length];

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{1, 0});
        visited[1] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int[] v = q.poll();

            for (int node : gragh.get(v[0])) {

                if (visited[node]) continue;

                visited[node] = true;
                dist[node] = v[1] + 1;
                q.add(new int[]{node, v[1] + 1});
            }

        }

    }
}
