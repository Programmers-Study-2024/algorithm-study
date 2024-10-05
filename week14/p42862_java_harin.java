package week14;
import java.util.*;
/**
 * lv 1
 * 체육복
 * 학생수 배열 1로 초기화하고 도둑당하면 -1 여벌 있으면 +1
 */
public class p42862_java_harin {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            int[] arr = new int[n+1];
            Arrays.fill(arr, 1);
            for (int i: lost) arr[i] -= 1;
            for (int i: reserve) arr[i] += 1;

            for (int i=1; i<n; i++){
                if (arr[i]==2 && arr[i+1]==0){
                    arr[i] -= 1;
                    arr[i+1] += 1;
                }
                if (arr[i]==0 && arr[i+1]==2){
                    arr[i] += 1;
                    arr[i+1] -= 1;
                }
            }

            if(arr[n]==0 && arr[n-1] == 2){
                arr[n-1] -= 1;
                arr[n] += 1;
            }

            for (int i=1; i<arr.length; i++){
                if (arr[i] != 0) answer ++;
            }

            return answer;
        }
    }
}
