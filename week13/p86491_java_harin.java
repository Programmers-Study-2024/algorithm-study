package week13;
import java.util.*;
/**
 * lv 1
 * 최소직사각형
 */
public class p86491_java_harin {
    class Solution {
        public int solution(int[][] sizes) {
            int w = 0;
            int h = 0;
            for (int[] size: sizes){
                Arrays.sort(size);
            }
            for (int[] size: sizes){
                w = Math.max(w, size[0]);
                h = Math.max(h, size[1]);
            }
            return w*h;
        }
    }
}
