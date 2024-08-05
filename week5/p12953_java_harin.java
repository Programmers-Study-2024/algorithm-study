package week5;
import java.util.*;
/**
 * lv 2
 * N개의 최소공배수
 */
public class p12953_java_harin {
    /**
     * 최소공배수 = (n1 * n2) / n1과 n2의 최대공약수
     */
    class Solution {
        public int solution(int[] arr) {
            Arrays.sort(arr);
            int answer = arr[0];
            for (int i=1; i<arr.length; i++){
                answer = answer * arr[i] / gcd(answer, arr[i]); // 최소공배수
            }
            return answer;
        }

        // 최대 공약수
        private int gcd (int n1, int n2){
            if (n1 % n2 == 0){
                return n2;
            }
            return gcd(n2, n1 % n2);
        }
    }
}
