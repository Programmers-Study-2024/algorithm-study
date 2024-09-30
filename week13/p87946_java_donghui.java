package week13;

public class p87946_java_donghui {
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    static boolean[] check;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        // 모든 조합 구해서 최소 찾기
        arr = new int[dungeons.length];
        check = new boolean[dungeons.length];
        dfs(k, dungeons, 0, dungeons.length);


        return max;
    }

    static void dfs(int k, int[][] dungeons, int L, int len) {

        if (L == len) {
            int cnt = 0;
            int power = k;
            for (int idx : arr) {
                int need = dungeons[idx][0];
                int down = dungeons[idx][1];

                if (power >= need) {
                    power -= down;
                    cnt++;
                }
            }
            max = Math.max(max, cnt);

            return;
        }


        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[L] = i;
                dfs(k, dungeons, L + 1, len);
                check[i] = false;
            }

        }

    }

}


