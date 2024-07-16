package week2;
import java.util.*;
/**
 * lv 1
 * 정수 내림차순으로 배치하기
 * 1. long -> String
 * 2. 각각의 String -> Integer 배열
 * 3. Integer 배열 내림차순 정렬
 * 4. StringBuilder로 합치기
 * 5. parseLong
 * 위와 같은 단계로 풀이했는데, for문을 두 번 써서 좋지 않은 풀이 같습니다. 밑에 GoodSolution으로 추가 풀이 넣어놨습니다.
 */
public class p12933_java_harin {
    /**
     * 내 풀이
     */
    static class Solution {
        public long solution(long n) {
            String s = String.valueOf(n); // 입력값 long to String
            Integer[] arr = new Integer[s.length()];
            StringBuilder sb = new StringBuilder();

            for (int i=0; i<s.length(); i++){
                arr[i] = (Character.getNumericValue(s.charAt(i))); // 입력값 Integer[] 배열에 넣어주기
            }
            Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬 (int x Integer o)

            for (int j=0; j<arr.length; j++){
                sb.append(arr[j]); // 내림차순 정렬한 arr StringBuilder로 합쳐주기
            }

            return Long.parseLong(sb.toString()); // parseLong
        }
    }

    /**
     * 다른사람 풀이
     */
    static class GoodSolution{
        public long solution(long n){
            StringBuilder sb = new StringBuilder();
            String list[] = String.valueOf(n).split(""); // 입력값 long to String[] 배열
            Arrays.sort(list); // 오름차순 정렬
            System.out.println(Arrays.toString(list));

            for (String newList : list){
                sb.append(newList); // StringBuilder로 합쳐주기
            }
            return Long.parseLong(sb.reverse().toString()); // sb 역순 정렬 후 parseLong
        }
    }

    public static void main(String[] args) {
        GoodSolution s = new GoodSolution();
        System.out.println(s.solution(118372));
    }
}
