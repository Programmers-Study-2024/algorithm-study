package week8;

import java.util.Arrays;
import java.util.Comparator;

public class p12915_java_donghui {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};


        // n 번째 글자순으로 정렬하되, 같으면 그냥 사전순으로 정렬
        Arrays.sort(strings, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        if (s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                        else return s1.charAt(n) - s2.charAt(n);
                    }

                }

        );


        return strings;
    }
}
