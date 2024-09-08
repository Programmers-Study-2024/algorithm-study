package week10;
/**
 * lv 1
 * 덧칠하기
 */
public class p161989_java_harin {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0; //페인트칠 횟수
            int i=0; // 처리할 section 배열 인덱스
            while(i<section.length){
                int start = section[i];
                answer++;
                while(i<section.length && section[i]< start + m){
                    i++;
                }
            }
            return answer;
        }
    }
}
