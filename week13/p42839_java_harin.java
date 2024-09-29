package week13;
import java.util.*;
/**
 * lv 2
 * 소수 찾기
 */
public class p42839_java_harin {
    class Solution {
        static Set<Integer> set = new HashSet<>();
        public int solution(String numbers) {
            int answer = 0;
            genComb("", numbers);
            for (int i : set){
                if (division(i)) answer++;
            }
            return answer;
        }
        private void genComb(String prefix, String numbers){
            if (!prefix.isEmpty()) set.add(Integer.parseInt(prefix));
            for (int i=0; i<numbers.length(); i++){
                genComb(prefix + numbers.charAt(i),
                        numbers.substring(0, i) + numbers.substring(i+1));
            }
        }
        private boolean division(int num){
            if (num < 2) return false;
            for (int i=2; i*i<=num; i++){
                if (num%i==0) return false;
            }
            return true;
        }
    }
}
