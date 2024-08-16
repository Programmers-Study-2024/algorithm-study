package week7;
import java.util.*;
/**
 * lv 2
 * 할인 행사
 * 1. count의 값은 discount길이-10 까지 증가
 * 2. count ~ count+10 까지 discount에서 want를 찾으면 want인덱스의 number값을 -1
 * 3. number 값이 모두 0이거나 음수이면 회원가입 가능한 날임.
 * 4. 10일 단위로 number 배열 초기화해주고 다시 1~3 반복
 */
public class p131127_java_harin {
    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            List<String> wantList = new ArrayList<>(Arrays.asList(want));
            int count = 0;
            int possibleDays = 0;

            while (count <= discount.length - 10){
                int[] numbers = Arrays.copyOf(number, number.length); // 10일 지나면 numbers 배열 초기화
                // 10일 체크
                for (int i=count; i < count+10; i++){
                    if (wantList.contains(discount[i])) {
                        int idx = wantList.indexOf(discount[i]);
                        numbers[idx]--; // 할인 상품 있으면 해당 number 감소
                    }
                }
                // numbers 체크
                if (check(numbers)) possibleDays++;
                count++;
            }
            return possibleDays;
        }

        // numbers의 모든 값이 0이거나 음수이면 회원가입 가능하므로 true
        private boolean check(int[] number){
            for (int i: number){
                if (i>0) return false;
            }
            return true;
        }
    }
}
