package week2;

/**
 * lv 1
 * 평균 구하기
 * 합을 배열 길이로 나눠서 풀이했습니다.
 * 함수나 라이브러리 사용해서 푸는법도 좋을 거 같습니다.
 */
public class p12944_java_harin {
    static class Solution {
        public double solution(int[] arr) {
            double answer = 0;
            for (int i=0; i<arr.length; i++){
                answer += arr[i];
            }
            return answer/arr.length;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
