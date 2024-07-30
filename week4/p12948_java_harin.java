package week4;
/**
 * lv 1
 * 핸드폰 번호 가리기
 */
public class p12948_java_harin {
    static class Solution {
        public String solution(String phone_number) {
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for(int i=phone_number.length() -1; i>=0; i--){
                if (count < 5) {
                    sb.append(phone_number.charAt(i));
                    count++;
                } else {
                    sb.append('*');
                }
            }


            return sb.reverse().toString();
        }
    }
}
