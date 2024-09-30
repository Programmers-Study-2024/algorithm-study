package week13;
import java.util.*;
/**
 * lv 2
 * [3차] 파일명 정렬
 */
public class p17686_java_harin {
    class Solution {
        public String[] solution(String[] files) {
            Arrays.sort(files, (f1, f2) -> {
                String[] parts1 = splitFile(f1);
                String[] parts2 = splitFile(f2);

                // HEAD 비교 (대소문자 구분하지 않음)
                int headCompare = parts1[0].toLowerCase().compareTo(parts2[0].toLowerCase());
                System.out.println(headCompare);
                if (headCompare != 0) return headCompare;

                // NUMBER 비교
                int numCompare = Integer.parseInt(parts1[1]) - Integer.parseInt(parts2[1]);
                System.out.println(numCompare);
                if (numCompare != 0) return numCompare;

                // HEAD와 NUMBER가 같을 경우 입력 순서 유지 (stable sort)
                return 0;
            });
            return files;
        }

        // 파일명을 HEAD, NUMBER, TAIL로 분리
        private String[] splitFile(String file) {
            String head = "";
            String number = "";
            String tail = "";

            int i = 0;
            // HEAD 추출 (숫자 나오기 전까지)
            while (i < file.length() && !Character.isDigit(file.charAt(i))) {
                head += file.charAt(i);
                i++;
            }
            // NUMBER 추출 (숫자 부분)
            while (i < file.length() && Character.isDigit(file.charAt(i))) {
                number += file.charAt(i);
                i++;
            }
            // TAIL 추출 (남은 부분)
            tail = file.substring(i);

            return new String[]{head, number, tail};
        }
    }

}
