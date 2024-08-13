package week6;
import java.util.*;
/**
 * lv 2
 * 귤 고르기
 */
public class p138476_java_harin {
    /**
     * 성공한 답안
     */
    class Solution {
        public int solution(int k, int[] tangerine) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for(int num : tangerine) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            ArrayList<Integer> arr = new ArrayList<Integer>(map.values());
            Collections.sort(arr, Collections.reverseOrder());

            for (int i: arr){
                k -= i;
                count++;
                if (k<=0) break;
            }
            return count;
        }
    }

    /**
     * 첫 번째 풀이
     * k의 범위가 클 경우에 시간초과가 난다..
     * 1. Map에 key는 배열 안의 값, value는 동일 값의 개수를 넣어준다
     * 2. map의 최대 value를 뽑아서 k에 계속 빼주고, 카운트 증가시키고, map에 해당 key를 지운다.
     * tangerine 배열의 값을 모두 순회해서 map에 넣어주는 형식이라 시간초과가 나는 거 같다..
     */
    class Solution1 {
        public int solution(int k, int[] tangerine) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            Arrays.sort(tangerine);
            for (int i=0; i<tangerine.length; i++){
                Integer search = map.get(tangerine[i]);
                if(search == null) map.put(tangerine[i], 1);
                else map.put(tangerine[i], search+1);
            }

            while (k > 0){
                Integer maxValue = Collections.max(map.values());
                k -= maxValue;
                count++;
                map.values().remove(maxValue);
            }

            return count;
        }
    }

    /**
     * Solution1 보다는 빠른데 마찬가지로 시간초과....
     */
    class Solution2 {
        public int solution(int k, int[] tangerine) {
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            Arrays.sort(tangerine);
            int cnt = 1;
            for (int i=0; i<tangerine.length-1; i++){
                if (tangerine[i] == tangerine[i+1]) {
                    cnt++;
                } else {
                    arr.add(cnt);
                    cnt = 1;
                }
            }
            arr.add(cnt);

            while (k > 0){
                int maxValue = Collections.max(arr);
                k -= maxValue;
                count++;
                arr.remove(Integer.valueOf(maxValue));
            }
            return count;
        }
    }
}
