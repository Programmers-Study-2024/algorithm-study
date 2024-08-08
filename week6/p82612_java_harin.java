package week6;
/**
 * lv 1
 * 부족한 금액 계산하기
 * 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면,
 * 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return
 */
public class p82612_java_harin {
    class Solution {
        public long solution(int price, int money, int count) {
            long totalPrice = 0;
            for (int i=1; i<=count; i++){
                totalPrice += price*i;
            }
            if (totalPrice-money<0) return 0; // 금액 부족하지 않으면 0 return 조건
            return totalPrice - money;
        }
    }
}
