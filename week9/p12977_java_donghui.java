package week9;

public class p12977_java_donghui {
    static int answer;
    static int[] arr;
    static boolean[] check;
    static boolean[] sumCheck;

    public int solution(int[] nums) {
        answer = 0;

        arr = new int[3];
        check = new boolean[nums.length];
        sumCheck = new boolean[50001];
        solve(nums, 0, 0, nums.length);


        return answer;
    }


    static void solve(int[] nums, int idx, int L, int len) {

        if (L == 3) {
            int sum = arr[0] + arr[1] + arr[2];


            for (int k = 2; k < sum; k++) {
                if (sum % k == 0) return;
            }
            answer++;
            return;

        }

        for (int i = idx; i < len; i++) {
            arr[L] = nums[i];
            solve(nums, i + 1, L + 1, len);


        }


    }
}
