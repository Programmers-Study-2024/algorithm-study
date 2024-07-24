package week3;
/**
 * lv 1
 * 음양 더하기
 * 입력 : [4,7,12]	[true,false,true]
 * 출력 : 9
 */
public class p76501_java_harin {
    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i=0; i<absolutes.length; i++){
                if (signs[i] == false) absolutes[i] *= -1; // -1 곱해서 음수로 만들어주기
            }
            for (int i: absolutes){
                answer += i; // 배열의 합
            }
            return answer;
        }
    }

    static public void main(String[] args){
        Solution s = new Solution();
    }
}
