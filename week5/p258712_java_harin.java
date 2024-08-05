package week5;
import java.util.*;

/**
 * lv 1
 * 가장 많이 받은 선물
 */
public class p258712_java_harin {
    /**
     * 선물지수 = 준 선물 수 - 받은 선물 수
     * A B : A는 선물 준 친구 B는 선물 받은 친구
     * 조건
     * 1. 두 사람이 선물을 주고받은 기록이 있는 경우: A가 B에게 선물을 더 많이 줬다면, B가 A에게 선물을 하나 줍니다.
     * 2. 두 사람이 선물을 주고받은 기록이 없는 경우: 선물 지수(준 선물 수 - 받은 선물 수)를 비교합니다.
     * 선물 지수가 큰 친구가 작은 친구에게 선물을 하나 줍니다.
     */
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            StringTokenizer st;
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            int[] count = new int[friends.length];
            int[][] record = new int[friends.length][friends.length];
            int answer = 0;

            for (int i=0; i<friends.length; i++){
                map.put(friends[i], i);
            }

            for (String str: gifts){
                st = new StringTokenizer(str);
                String send = st.nextToken();
                String receive = st.nextToken();
                count[map.get(send)]++;
                count[map.get(receive)]--;
                record[map.get(send)][map.get(receive)]++;
            }

            for (int i=0; i<friends.length; i++){
                int cnt = 0;
                for (int j=0; j<friends.length; j++){
                    if(i == j) continue;
                    if (record[i][j] > record[j][i]) cnt ++;
                    else if (record[i][j] == record[j][i] && count[i] > count[j]) cnt++;
                }
                answer = Math.max(cnt, answer);
            }
            return answer;
        }
    }
}
