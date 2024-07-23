package week3;
/**
 * lv 1
 * 서울에서 김서방 찾기
 * 입력 : ["Jane", "Kim"]
 * 출력 : "김서방은 1에 있다"
 */
public class p12919_java_harin {
    static class Solution {
        public String solution(String[] seoul) {
            StringBuilder sb = new StringBuilder();
            int x = index(seoul);
            sb.append("김서방은 " + x + "에 " + "있다");
            return sb.toString();
        }
        private int index(String[] seoul) {
            for (int i=0; i<seoul.length; i++){
                if (seoul[i].equals("Kim")){
                    return i;
                }
            }
            return 0;
        }
    }

    static public void main(String[] args) {
        Solution s = new Solution();
    }
}
