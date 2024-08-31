package week9;
import java.util.*;
/**
 * lv 1
 * 모의고사
 */
public class p42840_java_harin {
    class Solution {
        public int[] solution(int[] answers) {
            ArrayList<Integer> arr = new ArrayList<>();
            int[] supo1 = {1, 2, 3, 4, 5};
            int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] score = {0, 0, 0};

            // 수포자 1, 2, 3 스코어 기록
            for(int i=0; i<answers.length; i++){
                if (answers[i] == (supo1[i%5])) score[0]++;
                if (answers[i] == (supo2[i%8])) score[1]++;
                if (answers[i] == (supo3[i%10] )) score[2]++;
            }

            int max = Math.max(score[0], Math.max(score[1], score[2]));

            // 최댓값 arr 배열에 넣기
            for (int i=0; i<3; i++){
                if (max == score[i]) arr.add(i+1);
            }

            int[] answer = new int[arr.size()];

            // int[] 로 변환
            for (int i=0; i<arr.size(); i++){
                answer[i] = arr.get(i);
            }

            return answer;
        }
    }
}
