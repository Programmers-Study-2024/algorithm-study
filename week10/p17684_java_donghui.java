package week10;

import java.util.ArrayList;
import java.util.HashMap;

public class p17684_java_donghui {
    public int[] solution(String msg) {

        HashMap<String,Integer> map = new HashMap<>();
        // A ~ Z 입력
        for(int i =65;i<=90;i++) {
            char c = (char)i;
            map.put(c+"",i-64);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int lastIdx = 26;
        int idx = 0;
        String w = "";
        String c = "";
        while(idx < msg.length()-1) {
            w += msg.charAt(idx);

            // w가 map 안에 있고 w+c 가 map안에 없을 때 -> 출력 + 사전 추가
            if(map.containsKey(w)) {
                c = w + msg.charAt(idx+1);
                if(!map.containsKey(c)) {
                    ans.add(map.get(w));
                    lastIdx++;
                    map.put(c,lastIdx);
                    w = "";
                }

                idx++;
            }
        }

        // 제일 마지막은 그냥 map 안에 있는지만 보고 출력할지 안할지 판단
        w += msg.charAt(idx);
        if(map.containsKey(w)) {
            ans.add(map.get(w));
        }

        int[] answer = new int[ans.size()];
        for(int in = 0; in < ans.size();in++) {
            answer[in] = ans.get(in);
        }



        return answer;
    }

}
