package week3;
/**
 * lv 1
 * 나머지가 1이 되는 수 찾기
 */
public class p87389_java_harin {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i=(n-1); i>1; i--){
                if (n % i == 1) {
                    answer = i;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}
