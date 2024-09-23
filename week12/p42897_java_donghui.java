package week12;

public class p42897_java_donghui {
    public int solution(int[] money) {
        int answer = 0;
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];


        if(money.length == 1)return money[0];

        //첫집 털때랑 안털때로 구분
        dp1[0] = money[0];
        dp1[1] = money[0];

        dp2[0] = 0;
        dp2[1] = money[1];

        for(int i =2;i<money.length;i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+money[i]);
            dp2[i] = Math.max(dp2[i-1],dp2[i-2]+money[i]);
        }


        answer = Math.max(dp1[money.length-2],dp2[money.length-1]);


        return answer;
    }
}
