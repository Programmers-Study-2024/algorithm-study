package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p42578_java_donghui {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();      // 종류

        for (int i = 0; i < clothes.length; i++) {
            if (map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
                arr.add(clothes[i][1]);
            }
        }

        //       map.forEach((key, value) -> {System.out.println(key+ " : " + value);        });

        for (int j = 0; j < arr.size(); j++) {
            answer *= map.get(arr.get(j)) + 1;
        }

        answer -= 1;

        return answer;


    }
}
