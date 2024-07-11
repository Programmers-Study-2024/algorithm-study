package week2;

/**
 * lv 1
 * 하샤드 수
 * 입력값의 각 자릿수 합으로 입력값 나눴을 때 나머지 0 이면 true, 아니면 false
 */
public class p12947_java_harin {
    static class Solution {
        public boolean solution(int x) {
            int check = 0;
            for (char ch: String.valueOf(x).toCharArray()){ // int to String -> toCharArray로 값 하나씩 빼오기
                int i = ch - '0'; // char to int
                check += i;
            }
            return (x % check == 0) ? true : false; //x % check == 0 으로만 반환해도 동일함
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}
