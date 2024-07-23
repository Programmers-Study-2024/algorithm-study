package week3;
/**
 * lv 1
 * 콜라츠 추측
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
 */
public class p12943_java_harin {
    static class Solution {
        public int solution(int num) {
            int count = 0;
            if (num == 1) return 0; // 입력값 1이면 0 반환
            while (num > 0) {
                num = num % 2 == 0 ? num / 2 : num * 3 + 1;
                count++;
                if (num == 1) return count; // num이 1 일 때 count 반환
                if (count == 500) break;
            }
            return -1; // count 500 이상일 때 while문 탈출하므로 -1 반환
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(626331));
    }
}
