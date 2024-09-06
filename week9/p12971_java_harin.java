package week9;
/**
 * lv 3
 * 스티커 모으기(2)
 */
public class p12971_java_harin {
    class Solution {
        public int solution(int sticker[]) {
            int len = sticker.length;
            int[] dp1 = new int[len];
            int[] dp2 = new int[len];

            if (len==1) return sticker[0];

            // 첫 번째 스티커 뗐을때
            dp1[0] = sticker[0];
            dp1[1] = dp1[0];
            for (int i=2; i<len-1; i++){
                dp1[i] = Math.max(dp1[i-2] + sticker[i], dp1[i-1]);
            }

            // 첫 번째 스티커 안 뗐을때
            dp2[0] = 0;
            dp2[1] = sticker[1];
            for (int i=2; i<len; i++){
                dp2[i] = Math.max(dp2[i-2] + sticker[i], dp2[i-1]);
            }

            return Math.max(dp1[len-2], dp2[len-1]);
        }
    }
}
