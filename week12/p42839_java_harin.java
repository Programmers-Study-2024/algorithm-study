package week12;
import java.util.*;
/**
 * lv 2
 * 소수 찾기
 * - 재귀적으로 숫자 조합 생성하는 코드 구글링함 -> 외우자..
 */
public class p42839_java_harin {
    class Solution {
        public Set<Integer> set = new HashSet<>();
        public int solution(String numbers) {
            int answer = 0;
            genComb("", numbers);
            // 저장된 조합 중 소수를 카운트
            for (int num : set) {
                System.out.println(num);
                if (division(num)) answer++;
            }
            return answer;
        }

        // 재귀적으로 숫자 조합 생성
        private void genComb(String prefix, String numbers) {
            if (!prefix.isEmpty()) {
                set.add(Integer.parseInt(prefix));
            }

            for (int i = 0; i < numbers.length(); i++) {
                genComb(prefix + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
            }
        }

        private boolean division(int num){
            if (num < 2) return false;
            for (int i=2; i*i<=num; i++){
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}
