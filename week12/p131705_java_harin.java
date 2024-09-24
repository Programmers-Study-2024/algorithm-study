package week12;
/**
 * lv 1
 * 삼총사
 * 조합을 구현해야되나.. 했는데 3중 for문으로 풀면 됨..
 */
public class p131705_java_harin {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            for (int i=0; i<number.length; i++){
                for (int j=i+1; j<number.length; j++){
                    for (int k=j+1; k<number.length; k++){
                        if (number[i] + number[j] + number[k] == 0) answer++;
                    }
                }
            }
            return answer;
        }
    }

}
