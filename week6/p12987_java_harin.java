package week6;
import java.util.*;
/**
 * lv 3
 * 숫자 게임
 * A	B	result
 * [5,1,3,7]	[2,2,6,8]	3
 * [2,2,2,2]	[1,1,1,1]	0
 */
public class p12987_java_harin {
    class Solution {
        public int solution(int[] A, int[] B) {
            int count = 0;
            int len = A.length - 1;
            int index = len;
            Arrays.sort(A);
            Arrays.sort(B);

            for(int i=len; i>=0; i--) {
                if(B[index] > A[i]) {
                    count++;
                    index--;
                }
            }
            return count;
        }
    }
}
