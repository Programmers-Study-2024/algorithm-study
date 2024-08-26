package week8;

/**
 * lv 1
 * 2016년
 * 좀 더럽게 푼 거 같다..
 */
public class p12901_java_harin {
    class Solution {
        public String solution(int a, int b) {
            String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            if (a == 1 || a == 4 || a == 7) return answer[(b%7+4)%7];
            if (a == 2 || a == 8) return answer[(b%7)%7];
            if (a == 3 || a == 11) return answer[(b%7+1)%7];
            if (a == 5) return answer[(b%7+6)%7];
            if (a == 6) return answer[(b%7+2)%7];
            if (a == 9 || a == 12) return answer[(b%7+3)%7];
            if (a == 10) return answer[(b%7+5)%7];
            return "";
        }
    }
}
