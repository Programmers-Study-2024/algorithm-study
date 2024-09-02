package week9;

import java.util.ArrayList;
import java.util.Collections;

public class p17677_java_donghui {
    static int INF = 65536;

    public int solution(String str1, String str2) {
        int answer = 0;

        // 대소문자 무시
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        //    System.out.println(str1+" "+str2);

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        String s1 = "";
        char c1;
        char c2;

        for (int i = 0; i < str1.length() - 1; i++) {
            s1 = "";
            c1 = str1.charAt(i);
            c2 = str1.charAt(i + 1);
            if ((int) c1 < 65 || (int) c1 > 90) continue;
            s1 += c1;
            if ((int) c2 < 65 || (int) c2 > 90) continue;
            s1 += c2;

            arr1.add(s1);


        }

        String s2 = "";
        for (int i = 0; i < str2.length() - 1; i++) {
            s2 = "";
            c1 = str2.charAt(i);
            c2 = str2.charAt(i + 1);
            if ((int) c1 < 65 || (int) c1 > 90) continue;
            s2 += c1;
            if ((int) c2 < 65 || (int) c2 > 90) continue;
            s2 += c2;

            arr2.add(s2);

        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        // 교집합, 합집합 구하기
        int A = 0;
        int B = 0;
        for (String s : arr1) {
            if (arr2.remove(s)) {
                A++;
            }
            B++;
        }

        // B += arr2.size();

        for (String s : arr2) {
            B++;
        }

        System.out.println("A = " + A + " B = " + B);
        // System.out.println("A = "+intersection.size()+" B = "+union.size());

        double j = 0;
        if (A == 0 && B == 0) j = 1;
        else {
            j = (double) A / B;
        }

        answer = (int) (j * INF);

        return answer;
    }
}
