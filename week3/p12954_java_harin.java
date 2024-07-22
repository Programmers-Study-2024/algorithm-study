package week3;

import week2.p42628_java_harin;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * lv 1
 * x만큼 간격이 있는 n개의 숫자
 */
public class p12954_java_harin {
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            for (int i=0; i<n; i++){
                answer[i] = (long) x*(i+1); // 형변환 안해주면 테스트케이스에서 걸림
            }
            return answer;
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(2, 5)));
    }
}
