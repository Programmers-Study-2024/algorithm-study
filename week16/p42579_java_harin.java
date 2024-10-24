package week16;
import java.util.*;
public class p42579_java_harin {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            // 1. 장르별 총 재생 횟수와 장르 내 노래 리스트를 저장할 HashMap
            HashMap<String, Integer> genrePlayCount = new HashMap<>();
            HashMap<String, List<int[]>> genreSongs = new HashMap<>();

            // 2. 장르별로 데이터를 수집
            for (int i = 0; i < genres.length; i++) {
                genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);

                // 노래 정보를 [고유 번호, 재생 수] 형태로 저장
                genreSongs.putIfAbsent(genres[i], new ArrayList<>());
                genreSongs.get(genres[i]).add(new int[] { i, plays[i] });
            }

            // 3. 장르를 총 재생 횟수에 따라 정렬
            List<String> orderedGenres = new ArrayList<>(genrePlayCount.keySet());
            orderedGenres.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));

            // 4. 각 장르에서 가장 많이 재생된 두 곡을 선택
            List<Integer> result = new ArrayList<>();
            for (String genre : orderedGenres) {
                List<int[]> songs = genreSongs.get(genre);

                // 재생 횟수 내림차순, 고유 번호 오름차순으로 정렬
                songs.sort((a, b) -> b[1] != a[1] ? b[1] - a[1] : a[0] - b[0]);

                // 최대 두 곡까지 결과에 추가
                result.add(songs.get(0)[0]);
                if (songs.size() > 1) {
                    result.add(songs.get(1)[0]);
                }
            }

            // 5. 결과를 int 배열로 변환하여 반환
            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
