package week9;
import java.util.*;

/**
 * lv 2
 * [1차] 뉴스 클러스터링
 * - Character.isAlphabetic : 알파벳 확인 함수
 */
public class p17677_java_harin {
    class Solution {
        public int solution(String str1, String str2) {
            List<String> arr1 = new ArrayList<>();
            List<String> arr2 = new ArrayList<>();

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // str1의 i, i+1 알파벳이면 arr1 리스트에 넣기
            for (int i=0; i<str1.length()-1; i++){
                if (Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i+1))){
                    arr1.add(str1.substring(i,i+2));
                }
            }
            // str2의 i, i+1 알파벳이면 arr2 리스트에 넣기
            for (int i=0; i<str2.length()-1; i++){
                if (Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i+1))){
                    arr2.add(str2.substring(i,i+2));
                }
            }

            double intersection=0;
            double union=0;

            for (String s : arr1){
                if(arr2.remove(s)) intersection++; // arr2에 arr1 값이 있으면 지우고 교집합++
                union++; // arr1의 모든 값 합집합++
            }

            for (String s : arr2){
                union++; // arr2의 교집합 제외 나머지 합집합++
            }

            if (union == 0 && intersection == 0) return 65536;
            return (int)((intersection / union) * 65536);
        }
    }
}
