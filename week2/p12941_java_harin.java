package week2;
import java.util.*;
/**
 * lv 2
 * 최솟값 만들기
 * (오름차순 정렬 배열의 각 원소 * 내림차순 정렬 배열의 각 원소) 의 누적 합이 최솟값입니다.
 */
public class p12941_java_harin {
    static class Solution{
        public int solution(int []A, int []B){
            int len = A.length;
            int answer = 0;
            Arrays.sort(A);
            Arrays.sort(B); // int[] 배열은 내림차순 정렬이 안됨
            for(int i=0; i<len; i++){
                answer += A[i] * B[(len-1)-i]; // B배열은 역순으로 곱해주기
            }
            return answer;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
