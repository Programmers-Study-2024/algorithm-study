package week12;
import java.util.*;

/**
 * lv 2
 * 주차 요금 계산
 */
public class p92341_java_harin {
    /**
     * 고려해야할 것
     * 1. IN 개수 > OUT 개수 => 23:59에 OUT으로 간주
     * 2. 정답 배열은 차량 번호 작은 순서대로 출력
     */
    class Solution {
        public int[] solution(int[] fees, String[] records) {
            HashMap<Integer, Integer> inTimeMap = new HashMap<>(); // IN 한 차량 넣기 (차량 번호, 시간)
            HashMap<Integer, Integer> checkMap = new HashMap<>(); // 주차시간 계산한 차량 넣기 (차량 번호, 시간)

            for (int i=0; i<records.length; i++){
                String[] tmp = records[i].split(" ");
                String[] timeTmp = tmp[0].split(":");

                int time = Integer.parseInt(timeTmp[0])*60 + Integer.parseInt(timeTmp[1]); // 시각
                int car = Integer.parseInt(tmp[1]); // 차량 번호
                String flag = tmp[2]; // 내역

                if (flag.equals("IN")){
                    inTimeMap.put(car, time);
                } else {
                    int calc = inTimeMap.remove(car); // IN한 시간 가져오기 (OUT 안 한 차량 검사 위해 가져오면 지움)
                    checkMap.put(car, checkMap.getOrDefault(car,0) + Math.max(calc-time, time-calc)); // 주차 시간 계산
                }
            }

            // OUT 안한 차량 체크
            int end = 23*60 + 59;
            inTimeMap.forEach((key, value) -> {
                checkMap.put(key, checkMap.getOrDefault(key, 0) + (end-value)); //
            });

            int[] keySet = new int[checkMap.size()];
            int[] answer = new int[checkMap.size()]; // 주차요금 배열
            int idx = 0;

            // 누적 주차시간 완료한 차량 번호 배열
            for (int key: checkMap.keySet()){
                keySet[idx++] = key;
            }
            Arrays.sort(keySet); // 차량번호 작은 순서대로 출력해야해서 정렬함

            int k = 0;
            for (int key : keySet){
                Integer value = checkMap.get(key);
                if (value <= fees[0]) answer[k++] = fees[1]; // 기본배열
                else answer[k++] = (int)(fees[1] + Math.ceil((double)(value-fees[0])/fees[2]) * fees[3]); // 주차요금계산
            }

            return answer;
        }
    }

}
