package week7;
import java.util.*;
/**
 * lv 3
 * 단속카메라
 */
public class p42884_java_harin {
    class Solution {
        public int solution(int[][] routes) {
            int answer = 0;
            Arrays.sort(routes, (o1, o2) -> {
                return o1[1] - o2[1]; //두 번째 요소에 따라 오름차순으로 정렬
            });

            int end = routes[0][1];
            answer++;

            for(int i=1; i<routes.length; i++) {
                if(end < routes[i][0]){
                    end = routes[i][1];
                    answer++;
                }
            }
            return answer;
        }
    }
}
