package week12;
/**
 * lv 1
 * 크기가 작은 부분 문자열
 */
public class p147355_java_harin {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            int len = p.length();
            String[] arr = new String[t.length()-p.length()+1];

            for (int i=0; i+len<=t.length(); i++){
                arr[i] = t.substring(i, i+len);
            }

            for (int i=0; i<arr.length; i++){
                if (Long.parseLong(arr[i]) <= Long.parseLong(p)) answer++; // Long으로 파싱하는부분 주의!
            }

            return answer;
        }
    }
}
