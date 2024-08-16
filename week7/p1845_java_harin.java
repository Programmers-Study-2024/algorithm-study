package week7;
import java.util.*;

/**
 * lv 1
 * 폰켓몬
 * - nums배열을 set에 넣고, 중복 제거
 * 1. set의 크기가 n/2보다 크거나 같으면 n/2만큼 가져갈 수 있음
 * 2. set의 크기가 n/2보다 작으면 set의 크기만큼 가져가는 것이 최대임
 */
public class p1845_java_harin {
    class Solution {
        public int solution(int[] nums) {
            int len = nums.length/2; // 가져갈 수 있는 폰켓몬 개수
            Set<Integer> set = new HashSet<Integer>();
            for (int i: nums){
                set.add(i); // nums 배열 값 set에 넣기
            }
            if (set.size() >= len) return len;
            else return set.size();
        }
    }
}
