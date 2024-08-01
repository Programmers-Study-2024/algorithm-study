package week4;
/**
 * lv 1
 * 수박수박수박수박수박수?
 */
public class p12922_java_harin {
    static class Solution {
        public String solution(int n) {
            String[] wm = {"수", "박"};
            String result = "";
            for (int i=0; i<n; i++){
                result += wm[i%2];
            }
            return result;
        }
    }
}
