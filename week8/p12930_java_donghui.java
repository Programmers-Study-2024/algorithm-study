package week8;

public class p12930_java_donghui {
    public String solution(String s) {
        String answer = "";

        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        // 단어(공백을 기준)별로 짝/홀수 인덱스를 판단!
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                sb.append(' ');
                idx = 0;
            } else if (idx % 2 == 0) {
                sb.append(Character.toUpperCase(c[i]));
                idx++;
            } else {
                sb.append(Character.toLowerCase(c[i]));
                idx++;
            }

        }

        return sb.toString();
    }
}
