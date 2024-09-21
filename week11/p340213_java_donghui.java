package week11;

public class p340213_java_donghui {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int video_lenNum = change(video_len);
        int posNum = change(pos);
        int op_startNum = change(op_start);
        int op_endNum = change(op_end);
        for (String command : commands) {
            if (posNum >= op_startNum && posNum <= op_endNum) posNum = op_endNum;
            if (command.equals("prev")) {
                if (posNum < 10) posNum = 0;
                else posNum -= 10;
            } else if (command.equals("next")) {
                if (video_lenNum - posNum < 10) posNum = video_lenNum;
                else
                    posNum += 10;
            }

            if (posNum >= op_startNum && posNum <= op_endNum) posNum = op_endNum;


        }

        int mi = posNum / 60;
        int se = posNum % 60;
        String min = mi + "";
        String sec = se + "";
        if (mi < 10) min = "0" + min;
        if (se < 10) sec = "0" + se;
        answer = min + ":" + sec;


        return answer;
    }

    // 다 초로 바꾸기
    static int change(String s) {
        int minute = Integer.parseInt(s.substring(0, 2));
        int second = Integer.parseInt(s.substring(3, 5));

        return minute * 60 + second;


    }
}
