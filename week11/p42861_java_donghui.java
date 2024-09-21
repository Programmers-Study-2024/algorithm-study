package week11;

import java.util.ArrayList;
import java.util.Collections;

public class p42861_java_donghui {
    static int[] unf;

    // 최소스패닝트리
    public int solution(int n, int[][] costs) {
        int answer = 0;

        ArrayList<Point> gragh = new ArrayList<>();
        unf = new int[n];
        for (int i = 0; i < n; i++) unf[i] = i;

        for (int[] c : costs) {
            gragh.add(new Point(c[0], c[1], c[2]));
        }
        Collections.sort(gragh);

        for (Point p : gragh) {
            int fa = find(p.v1);
            int fb = find(p.v2);
            if (fa != fb) {
                answer += p.cost;
                union(p.v1, p.v2);
            }
        }


        return answer;
    }


    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa > fb) unf[fa] = fb;
        else
            unf[fb] = fa;
    }

    static int find(int v) {
        if (unf[v] == v) return v;
        return unf[v] = find(unf[v]);
    }
}

class Point implements Comparable<Point> {
    int v1;
    int v2;
    int cost;

    public Point(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Point o) {
        return this.cost - o.cost;
    }
}
