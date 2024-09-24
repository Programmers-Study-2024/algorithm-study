package week12;

import java.util.HashSet;

public class p42839_java_donghui {
    static int count = 0;
    static boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;


        visited = new boolean[numbers.length()];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= numbers.length(); i++) {
            char[] dist = new char[i];
            solve(numbers, 0, i, dist, set);

        }


        return count;
    }

    static void solve(String numbers, int L, int len, char[] dist, HashSet<Integer> set) {
        if (L == len) {
            String s = "";
            for (char str : dist) {
                s += str;
            }
            int num = Integer.parseInt(s);
            if (set.contains(num)) return;
            set.add(num);
            if (num == 1 || num == 0) return;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return;
            }

            System.out.println(num);
            count++;
            return;
        }

        for (int j = 0; j < numbers.length(); j++) {
            if (!visited[j]) {
                visited[j] = true;
                dist[L] = numbers.charAt(j);
                solve(numbers, L + 1, len, dist, set);
                visited[j] = false;

            }

        }


    }
}
