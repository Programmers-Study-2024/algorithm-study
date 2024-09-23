package week12;
/**
 * lv 4
 * 도둑질
 */
public class p42897_java_harin {
    class Solution {
        public int solution(int[] money) {
            int len = money.length;
            // 첫 번째 집을 터는 경우 (마지막 집은 털 수 없음)
            int[] dp1 = new int[len];
            dp1[0] = money[0];
            dp1[1] = Math.max(money[0], money[1]);
            for (int i=2; i < len-1; i++) {
                dp1[i] = Math.max(dp1[i-1], dp1[i-2] + money[i]);
            }

            // 첫 번째 집을 털지 않는 경우 (마지막 집을 털 수 있음)
            int[] dp2 = new int[len];
            dp2[0] = 0;
            dp2[1] = money[1];
            for (int i=2; i<len; i++) {
                dp2[i] = Math.max(dp2[i-1], dp2[i-2] + money[i]);
            }

            // 두 경우 중 최댓값을 반환
            return Math.max(dp1[len-2], dp2[len-1]);
        }
    }
}
