package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class p64065_java_donghui {
    // 1. s를 2차원 배열로 만들기
    // 2. 각 배열의 사이즈가 작은순으로 정렬
    // 3. 정렬된 걸로 set을 통해서 없는걸 answer에 추가
    public int[] solution(String s) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 500; i++) arr.add(new ArrayList<>());         // return 하는 배열의 길이가 1 이상 500 이하인 경우


        int j = 1;
        int idx = -1;
        // 배열로 바꾸기
        while (j < s.length()) {
            if (s.charAt(j) != '{' && s.charAt(j) != ',' && s.charAt(j) != '}') {
                idx++;
                int start = j;
                int end = j;
                while (true) {
                    end++;
                    if (s.charAt(end) == ',') {
                        arr.get(idx).add(Integer.parseInt(s.substring(start, end)));
                        start = end + 1;
                    } else if (s.charAt(end) == '}') {
                        arr.get(idx).add(Integer.parseInt(s.substring(start, end)));
                        break;
                    }
                }
                j = end;
            }

            j++;
        }


        Collections.sort(arr, (a, b) -> (a.size() - b.size()));          // size 오름차순 정렬

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (ArrayList<Integer> ar : arr) {
            if (ar.size() == 0) continue;
            for (Integer in : ar) {
                if (set.add(in)) {
                    ans.add(in);
                    break;
                }
            }
        }

        int[] answer = new int[ans.size()];
        for (int l = 0; l < ans.size(); l++) {
            answer[l] = ans.get(l);
        }

        return answer;
    }
}
