package week13;

public class p42842_java_donghui {
    public int[] solution(int brown, int yellow) {
        int h = 3;      // 적어도 3
        int w = 3;      // 적어도 3
        int size = brown + yellow;

        while (true) {
            if (size % h == 0) {
                w = size / h;
                if ((h - 2) * (w - 2) == yellow) {
                    break;
                }

            }


            h++;
        }

        int[] answer = new int[2];
        answer[0] = w;
        answer[1] = h;
        return answer;
    }
}
