package week9;
/**
 * lv 2
 * k진수에서 소수 개수 구하기
 */
public class p92335_java_harin {
    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            String tmp = Integer.toString(n, k).toUpperCase(); // k진수로 변환
            String[] arr = tmp.split("0"); // 0 기준으로 나누기

            for (String s: arr){
                int check = 0;
                if (s.isEmpty()) continue; // 빈 값이면 패스
                double num = Double.parseDouble(s); 
                for (double i=2; i*i<=num; i++){
                    if (num % i == 0) check++; // 소수가 아니면 check값 증가
                }
                if (check == 0 && num!=1) answer++; // 소수 개수 세기
            }
            return answer;
        }
    }
}
