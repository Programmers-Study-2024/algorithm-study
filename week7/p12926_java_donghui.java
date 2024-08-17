package week7;

public class p12926_java_donghui {

    // A = 65, a = 97 size = 26
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == ' ') sb.append(c);
            else {
                if((int) c <= 90) {
                    c += n;
                    if((int)c > 90) c -= 26;
                } else {
                    c += n;
                    if((int)c > 122) c-= 26;
                }

                sb.append(c);
            }
        }

        answer = sb.toString();



        return answer;
    }
}
