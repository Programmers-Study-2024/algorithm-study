package week3;
/**
 * lv 1
 * 없는 숫자 더하기
 * 입력 : [1,2,3,4,6,7,8,0]
 * 출력 : 14
 */
public class p86051_java_harin {
    static class Solution {
        public int solution(int[] numbers) {
            int sum = 0;
            for (int i=0; i<numbers.length; i++){
                sum += numbers[i]; // numbers 배열의 합
            }
            return (45 - sum); // 0~9까지 합 - numbers 배열의 합
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
