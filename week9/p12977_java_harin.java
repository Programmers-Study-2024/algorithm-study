package week9;
import java.util.*;
/**
 * lv 1
 * 소수 만들기
 */
public class p12977_java_harin {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int len = nums.length;

            // 배열 원소 중 서로 다른 3개의 원소 합
            for(int i=0; i<len; i++){
                if (i+2 >= len) break;
                for (int j=i+1; j<len; j++){
                    for (int k=j+1; k<len; k++){
                        arr.add(nums[i] + nums[j] + nums[k]); // arr에 3개의 합 넣기
                    }
                }
            }

            // arr 배열 값이 소수인지 판별하고 소수면 answer++
            for (int i=0; i<arr.size(); i++){
                int tmp = 0;
                for (int j=2; j<arr.get(i); j++){
                    if (arr.get(i) % j == 0) tmp++;
                }
                if (tmp == 0) answer++;
            }

            return answer;
        }
    }
}
