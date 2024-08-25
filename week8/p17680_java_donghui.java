package week8;

import java.util.ArrayList;

public class p17680_java_donghui {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> cache = new ArrayList<>();

        if (cacheSize == 0) return cities.length * 5;

        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toLowerCase();       // 대소문자 구분 x

            // 도시가 cache 안에 있는지 판별
            if (cache.contains(s)) {                 // 있으면 cache 안에 있는걸 삭제 + 맨 뒤에 다시 넣기 + 시간 += 1
                cache.remove(s);
                answer += 1;
            } else {                                // 없으면 cache 공간이 있으면 그냥 뒤에 추가, 없으면 맨 앞에꺼 버리고 뒤에 추가 + 시간 +=5
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }

                answer += 5;
            }

            cache.add(s);


        }


        return answer;
    }
}
