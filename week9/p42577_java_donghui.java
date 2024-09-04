package week9;

import java.util.Arrays;

public class p42577_java_donghui {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);        // 사전순 정렬!


        //  System.out.println(Arrays.toString(phone_book));
        for (int i = 0; i < phone_book.length - 1; i++) {
            String str = phone_book[i];
            if (phone_book[i + 1].length() < str.length()) continue;           // 문자열 사전순 정렬이라 앞에가 더 클 수 도 있음
            if (phone_book[i + 1].substring(0, str.length()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
