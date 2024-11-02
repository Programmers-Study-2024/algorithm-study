package week16;
import java.util.*;

public class p1845_java_harin {
    class Solution {
        public int solution(int[] nums) {
            int len = nums.length/2;
            Set<Integer> set = new HashSet<Integer>();
            for (int i: nums){
                set.add(i);
            }
            if (set.size() >= len) return len;
            else return set.size();
        }
    }
}
