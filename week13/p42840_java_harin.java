package week13;
import java.util.*;
/**
 * lv 1
 * 모의고사
 */
public class p42840_java_harin {
    class Solution {
        public int[] solution(int[] answers) {
            ArrayList<Integer> arr = new ArrayList<>();
            int[] supo1 = {1,2,3,4,5};
            int[] supo2 = {2,1,2,3,2,4,2,5};
            int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
            int ans1=0, ans2=0, ans3=0;
            for (int i=0; i<answers.length; i++){
                if (answers[i] == supo1[i%5]) ans1++;
                if (answers[i] == supo2[i%8]) ans2++;
                if (answers[i] == supo3[i%10]) ans3++;
            }
            int max = Math.max(Math.max(ans1, ans2), ans3);
            if (max == ans1) arr.add(1);
            if (max == ans2) arr.add(2);
            if (max == ans3) arr.add(3);

            int[] answer = new int[arr.size()];

            for (int i=0; i<arr.size(); i++){
                answer[i] = arr.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
