package week13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class p86971_java_donghui {
    static int min = Integer.MAX_VALUE;

    public int solution(int n, int[][] wires) {
        int answer = -1;

        ArrayList<ArrayList<Integer>> gragh = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            gragh.add(new ArrayList<>());
        }

        for (int j = 0; j < wires.length; j++) {
            int a = wires[j][0];
            int b = wires[j][1];

            gragh.get(a).add(b);
            gragh.get(b).add(a);
        }

        for (int k = 1; k <= n; k++) {
            solve(gragh, k, n);
        }

        return min;
    }

    static void solve(ArrayList<ArrayList<Integer>> gragh, int v, int len) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[len + 1];
        for (int n = 0; n < gragh.get(v).size(); n++) {
            q.add(v);
            check[gragh.get(v).get(n)] = true;          // v 와 연결된 정점 하나 자르기
            int count = 1;
            while (!q.isEmpty()) {
                int num = q.poll();
//                if(check[num]) continue;

                check[num] = true;

                for (Integer node : gragh.get(num)) {
                    if (!check[node]) {
                        check[node] = true;
                        count++;
                        q.add(node);
                    }
                }

            }
            int sum = Math.abs(len - (2 * count));
            min = Math.min(min, sum);

            if (min == 0) return;
            check = new boolean[len + 1];
        }


    }
}

