package week10;

public class p84512_java_donghui {
    static boolean flag;
    static int cnt;
    static char[] w = { 'A', 'E', 'I', 'O', 'U'};

    public int solution(String word) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        flag= false;
        cnt = 0;
        solve(word,sb);
        answer = cnt;
        return answer;
    }

    static void solve(String word,StringBuilder sb) {
        if(flag) return;

        if(word.equals(sb.toString())) {
            flag = true;
        }

        if(sb.length() == 5) return;

        for(int i =0;i<5;i++) {
            if(flag) break;
            char c = w[i];
            cnt++;
            sb.append(c);
            solve(word,sb);
            sb.deleteCharAt(sb.length()-1);

        }
    }
}
