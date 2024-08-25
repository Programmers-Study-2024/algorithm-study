package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class p42579_java_donghui {

    // 재생수 높은 순으로 장르 나오게 함
    // 클래스 만들어서 재생수 높은 순으로 정렬 같으면 고유번호 낮은거 넣기
    public int[] solution(String[] genres, int[] plays) {

        // 각 장르당 총 재생수 먼저 구하기
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> gen = new ArrayList<>(map.keySet());
        Collections.sort(gen, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));        // 내림차순 정렬


        ArrayList<Integer> ans = new ArrayList<>();

        for (String s : gen) {
            PriorityQueue<Genre> pq = new PriorityQueue<>();
            for (int j = 0; j < genres.length; j++) {
                if (genres[j].equals(s)) {
                    pq.add(new Genre(j, plays[j]));
                }
            }

            int count = 0;

            while (!pq.isEmpty()) {
                if (count == 2) break;
                ans.add(pq.poll().index);
                count++;
            }

        }

        int[] answer = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            answer[k] = ans.get(k);
        }

        return answer;
    }

}


class Genre implements Comparable<Genre> {
    int index;
    int play;

    public Genre(int index, int play) {
        this.index = index;
        this.play = play;
    }

    @Override
    public int compareTo(Genre ge) {
        if (ge.play == this.play) return this.index - ge.index;
        return ge.play - this.play;
    }
}

