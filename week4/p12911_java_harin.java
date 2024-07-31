package week4;
/**
 * lv 2
 * 다음 큰 숫자
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 */
public class p12911_java_harin {
    static class Solution {
        public int solution(int n) {
            int next = n+1;
            while (true){
                if (Integer.bitCount(next) == Integer.bitCount(n)) break; // bitCount() : true 비트 개수 찾는 함수
                else next ++;
            }
            return next;
        }
    }
}
