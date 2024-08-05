package week5;
/**
 * lv 2
 * 점프와 순간 이동
 */
public class p12980_java_harin {
    /**
     * 백준 설탕배달 문제랑 비슷함. DP로 푸는 법도 연습해보자
     * 거꾸로 생각해서
     * case 1: 2로 나누어 떨어지지 않으면 -1(점프) 하고,
     * case 2: 나누어 떨어지면 /2 (순간이동) 해서 0이 될때까지 진행
     * 결과 : 점프한 개수 반환하기
     */
    public class Solution {
        public int solution(int n) {
            int ans = 0;
            while (n > 0){
                if (n % 2 == 0) n /= 2;
                else {
                    n--;
                    ans++;
                }
            }
            return ans;
        }
    }
}
