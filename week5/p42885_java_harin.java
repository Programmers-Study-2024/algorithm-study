package week5;
import java.util.*;
/**
 * lv 2
 * 구명보트
 */
public class p42885_java_harin {
    /**
     * 성공 코드
     * 정렬후 가장 가벼운 사람과 무거운 사람을 더한게 limit보다 작으면 보트추가
     * limit보다 크면 무거운사람 보트 추가
     */
    class Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);
            int i = 0; // 가장 가벼움
            int j = people.length-1; // 가장 무거움
            int answer = 0;
            while( i <= j){
                if (people[i] + people[j] <= limit){
                    i++; // 가장 가벼운 사람 태우기
                }
                j--; // 가장 무거운 사람 태우기
                answer++; // 보트 추가
            }
            return answer;
        }
    }

    /**
     * 테케는 통과했지만 실패한 코드..
     * 구명보트 최대 인원이 2명이니까 정렬한 배열중 두 값의 합이 limit보다 작으면 보트를 하나 태우고
     * 결과는 전체 people 수에서 짝지어 보트 태운 수를 빼도록 구현함
     * 이전 사람과 이후 사람만 고려해서 최적의 해가 아니라 놓치는 경우 발생하여 틀림
     */
    class Bad_Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);
            int answer = 0;
            int tmp = people[0];

            for (int i=1; i<people.length; i++){
                if (people[i-1] + people[i] <= limit){
                    answer++;
                    i++;
                }
            }
            return people.length - answer;
        }
    }
}
