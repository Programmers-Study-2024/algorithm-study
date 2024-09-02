package week9;

public class p43165_java_donghui {

    static boolean[] check;
    static int ans;

    public int solution(int[] numbers, int target) {
        int answer = 0;

        check = new boolean[numbers.length];
        ans = 0;

        dfs(numbers, 0, 0, target);

        return ans;
    }

    static void dfs(int[] numbers, int idx, int sum, int target) {

        // 탈출조건
        if (idx == numbers.length) {
            if (sum == target) ans += 1;

            return;
        }


        // 수행조건


        dfs(numbers, idx + 1, sum + numbers[idx], target);
        dfs(numbers, idx + 1, sum - numbers[idx], target);

    }
}
