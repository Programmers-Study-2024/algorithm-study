package week6;

public class p12917_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
        // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        answer = new String(arr);
        return answer;
    }

}
