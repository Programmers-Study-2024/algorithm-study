package week10;

import java.util.*;

public class p67258_java_donghui {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < gems.length; i++) {
            set.add(gems[i]);
        }

        int gemsSize = set.size();         // 전체 보석 갯수
        int lt = 0;
        int rt = 0;
        // map 안에 전체 보석 사이즈 있으면 후보추가 + lt 한칸 앞으로, 만약 map에 보석개수 0이면 remove
        // 없으면 map에 보석개수추가
        while (rt <= gems.length) {
            if (map.size() == gemsSize) {
                arr.add(new Point(lt + 1, rt));
                map.put(gems[lt], map.get(gems[lt]) - 1);
                if (map.get(gems[lt]) == 0) map.remove(gems[lt]);
                lt++;
            } else {
                if (rt >= gems.length) break;
                map.put(gems[rt], map.getOrDefault(gems[rt], 0) + 1);
                rt++;
            }
        }

        Collections.sort(arr);
//                 System.out.println(gemsSize);
//         for(Point p : arr) {

//         System.out.println(p.s +" "+ p.e);
//         }

        answer[0] = arr.get(0).s;
        answer[1] = arr.get(0).e;

        return answer;
    }

}

class Point implements Comparable<Point> {
    int s;
    int e;

    public Point(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Point po) {
        int n = this.e - this.s;
        int m = po.e - po.s;
        if (n == m) {
            return this.s - po.s;
        }
        return n - m;


    }
}

}
