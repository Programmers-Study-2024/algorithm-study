package week3;

/**
 *  lv 2
 * 숫자의 표현
 * 등차수열 이용해서 풀음
 * k : 연속된 자연수의 개수, n : 주어진 수, a : 첫째항
 * 등차수열 합공식 n = k(2a + k - 1)/2 = ak + (k(k-1))/2
 * 첫째항 a = (n - (k(k-1))/2) / k
 */
public class p12924_java_harin {
    static class Solution {
        public int solution(int n) {
            int count = 0;
            for(int k=1; k*(k-1)/2 < n; k++){
                if ((n-(k*(k-1)/2)) % k == 0){ // n - (k*(k-1))/2가 k로 나누어 떨어지면 합공식 성립
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }
}
