package week13;

public class p84512_java_donghui {
    static char[] dist = {'A', 'E', 'I', 'O', 'U'};
    static boolean flag = false;
    static int count = 0;

    public int solution(String word) {
        int answer = 0;


        StringBuilder sb = new StringBuilder();

        solve(sb, 0, word);

        return count;
    }

    public static void solve(StringBuilder sb, int num, String word) {
        if (flag) return;
        if (sb.toString().equals(word)) {
            flag = true;
            return;
        }

        if (num == 5) return;


        for (int i = 0; i < 5; i++) {
            if (flag) return;
            count++;
            sb.append(dist[i]);
            solve(sb, num + 1, word);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
