package week13;

import java.util.Arrays;
import java.util.Comparator;

public class p42861_java_donghui {
    static int[] unf;
    public int solution(int n, int[][] costs) {
        int answer = 0;

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        unf = new int[n];

        for(int i =0;i<n;i++) unf[i] = i;

        for(int[] cost : costs) {
            int v1 = cost[0];
            int v2 = cost[1];
            int c = cost[2];
            if(find(v1) != find(v2)) {
                union(v1,v2);
                answer += c;


            }
        }


        return answer;
    }



    public void union(int a,int b) {
        int fa = find(a);
        int fb = find(b);


        if(fa > fb) unf[fa] = fb;
        else
            unf[fb] = fa;

    }

    public int find(int a) {
        if(unf[a] == a) return a;

        return unf[a] = find(unf[a]);
    }
}

