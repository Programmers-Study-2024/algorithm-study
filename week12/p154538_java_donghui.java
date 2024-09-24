package week12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class p154538_java_donghui {
    public int solution(int x, int y, int n) {
        int answer = 0;

        HashSet<Integer> set= new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[]o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }

        });
        pq.add(new int[]{x,0});
        while(!pq.isEmpty()) {
            int[] num = pq.poll();

            if(num[0] == y) return num[1];

            if(num[0] > y) break;

            if(!set.contains(num[0])) {
                set.add(num[0]);
                if(num[0]+n == y|| num[0]*2 ==y|| num[0]*3==y) return num[1] +1;


                pq.add(new int[]{num[0]+n,num[1]+1});
                pq.add(new int[]{num[0]*2,num[1]+1});
                pq.add(new int[]{num[0]*3,num[1]+1});


            }

        }

        return -1;
    }
}
