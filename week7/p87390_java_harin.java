package week7;

/**
 * lv 2
 * n^2 배열 자르기
 * - n = 3 일 때
 * i%n 012 012 012
 * i/n 000 111 222
 * arr 123 223 333
 */
public class p87390_java_harin {
    /**
     * for문 안 left 값을 long으로 유지하면서 연산시에 int로 타입캐스팅해주면 런타임에러 안남
     * i%n > i/n 일 때 i%n+1, 아닐 경우 i/n+1 를 배열에 넣어서 계산함.
     * 다른 풀이 보니까 Max(행, 열) 규칙으로 풀 수도 있는걸 알게됨.
     */
    class Solution {
        public int[] solution(int n, long left, long right) {
            int[] arr = new int[(int)(right - left + 1)];
            for (long i = left; i <= right; i++) {
                if (i%n > i/n) arr[(int)(i - left)] = (int)(i % n) + 1;
                else arr[(int)(i - left)] = (int)(i / n) + 1;
            }
            return arr;
        }
    }

    /**
     * 이 풀이로 풀면 테케 12부터 런타임에러가 뜬다.
     * for문 안의 left를 int로 타입캐스팅 해줬는데 여기서 int 범위 초과 연산 발생하여 런타임 에러가 발생함
     */
    class BadSolution {
        public int[] solution(int n, long left, long right) {
            int[] arr = new int[(int)(right - left + 1)];
            for (int i = (int) left; i <= right; i++) {
                if (i%n > i/n)  arr[i-(int) left] = (i%n) + 1;
                else arr[i-(int) left] = (i/n) + 1;
            }
            return arr;
        }
    }
}
