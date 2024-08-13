package week6;
/**
 * lv 1
 * 약수의 개수와 덧셈
 * 1. left <= i <= right 범위의 i의 약수 개수 -> count 저장
 * 2. count가 짝수이면 answer 에 +i, 홀수이면 -i 을 더해줌
 */
public class p77884_java_harin {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            for (int i=left; i<=right; i++){
                int res = calc(i);
                answer += (res % 2 == 0) ? i : (i *(-1));
            }
            return answer;
        }

        private int calc(int x){
            int count = 0;
            for (int i=1; i<=x; i++){
                if (x % i == 0) count++;
            }
            return count;
        }
    }

}
