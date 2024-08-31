package week9;
/**
 * lv 1
 * 기사단원의 무기
 */
public class p136798_java_harin {
    class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;

            for(int i=1;i<=number;i++){
                int cnt = 0;
                for(int j=1;j*j<=i;j++){
                    if(j*j == i) cnt++;
                    else if(i%j==0) cnt += 2;
                }

                if(cnt > limit) cnt = power;
                answer += cnt;
            }

            return answer;
        }
    }
}
