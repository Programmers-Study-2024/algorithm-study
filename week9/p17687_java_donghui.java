package week9;

public class p17687_java_donghui {
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        int num = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {

            String str = Integer.toString(num, n).toUpperCase();         // 진수 변환 + 소문자로 나와서 대문자로 변환
            sb.append(str);
            if (sb.length() > 100000) break;
            num++;
        }

        for (int i = 0; i < t; i++) {
            answer += sb.charAt(p - 1 + m * i);


        }


        return answer;
    }

}
