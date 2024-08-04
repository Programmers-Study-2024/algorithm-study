package week5;

public class p43163_java_minsu {
    public static void main(String[] args) {
        
        // 문제 설명
        // 두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

        // 1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
        // 2. words에 있는 단어로만 변환할 수 있습니다.
        // 예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.

        // 두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;

        boolean[] visited = new boolean[words.length];
        answer = dfs(begin, target, words, visited, 0);

        return answer;
    }

    public static int dfs(String begin, String target, String[] words, boolean[] visited, int count) {
        if (begin.equals(target)) {
            return count;
        }

        int min = 0;
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isConvertible(begin, words[i])) {
                visited[i] = true;
                int result = dfs(words[i], target, words, visited, count + 1);
                visited[i] = false;

                if (result != 0) {
                    if (min == 0 || min > result) {
                        min = result;
                    }
                }
            }
        }

        return min;
    }

    public static boolean isConvertible(String begin, String target) {
        int count = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != target.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
    

}
