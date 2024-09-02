package week9;

public class p12971_java_donghui {
    public int solution(int sticker[]) {
        int answer = 0;
        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];

        if(sticker.length == 1) return sticker[0];

        // 첫번째 스티커 뗐을 때
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];

        // 첫번째 스티커 안뗐을 때
        dp2[0] = 0;
        dp2[1] = sticker[1];

        for(int i =2; i<sticker.length;i++) {

            dp1[i] = Math.max(dp1[i-1],sticker[i]+dp1[i-2]);
            dp2[i] = Math.max(dp2[i-1],sticker[i]+dp2[i-2]);
        }





        answer = Math.max(dp1[sticker.length-2],dp2[sticker.length-1]);




        return answer;
    }
}
