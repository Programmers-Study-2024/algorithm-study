package week13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class p42888_java_donghui {
    public String[] solution(String[] record) {

        Queue<String[]> q = new LinkedList<>();
        HashMap<String, String> map = new HashMap<>();       // 유저 아이디와 유저 이름 저장

        for (String r : record) {
            String[] message = r.split(" ");        // 0 : 명령어 1 : 유저아이디, 2: 닉네임

            if (message[0].equals("Enter")) {
                q.add(new String[]{message[1], "님이 들어왔습니다."});
                map.put(message[1], message[2]);

            } else if (message[0].equals("Leave")) {
                q.add(new String[]{message[1], "님이 나갔습니다."});
            } else {
                map.put(message[1], message[2]);

            }

        }


        String[] answer = new String[q.size()];


        int idx = 0;
        while (!q.isEmpty()) {
            String[] m = q.poll();
            String nickname = map.get(m[0]);

            answer[idx] = nickname + m[1];
            idx++;
        }


        return answer;
    }
}
