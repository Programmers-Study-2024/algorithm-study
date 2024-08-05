package week5;
/**
 * lv 3
 * 단어 변환
 * => 다시 풀어보기
 */

public class p43163_java_harin {
    class Solution {
        static int answer = 0;
        static boolean[] visited;
        public int solution(String begin, String target, String[] words) {
            visited = new boolean[words.length];
            dfs(begin, target, words, 0);
            return answer;
        }

        public static void dfs(String begin, String target, String[] words, int count){
            if (begin.equals(target)) {
                answer = count;
                return;
            }

            for (int i=0; i<words.length; i++){
                if (visited[i]){
                    continue;
                }
                int k = 0;
                // 글자 다른게 몇 개 인지 세기
                for (int j=0; j<begin.length(); j++){
                    if (begin.charAt(j) != words[i].charAt(j)){
                        k++;
                    }
                }
                if (k == 1) {
                    visited[i] = true;
                    dfs(words[i], target, words, count+1);
                    visited[i] = false; // 재설정
                }
            }
        }
    }
}
