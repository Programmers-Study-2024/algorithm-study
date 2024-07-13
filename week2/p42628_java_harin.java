package week2;
import java.util.*;
/**
 * lv 3
 * 이중우선순위큐
 */
public class p42628_java_harin {
    static class Solution {
        public int[] solution(String[] operations) {
            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            StringTokenizer st;

            for (int i=0; i<operations.length; i++){
                st = new StringTokenizer(operations[i]);
                char op = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());

                switch(op) {
                    case 'I':
                        min.add(num);
                        max.add(num);
                        break;
                    case 'D':
                        if(max.isEmpty()) break;
                        if(num == 1) {
                            int del = max.poll();
                            min.remove(del);
                        }
                        if(num == -1) {
                            int del = min.poll();
                            max.remove(del);
                        }
                }
            }

            if(max.isEmpty()) {
                return new int[] {0, 0};
            }
            return new int[] {max.peek(), min.peek()};
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
    }
}
