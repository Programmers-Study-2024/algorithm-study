package week3;

public class p12951_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
        // 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
        // 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

        String s = "3people unFollowed me";

        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (char c : s.toCharArray()) {
            if (isFirst) {
                sb.append(Character.toUpperCase(c));
                isFirst = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
            if (c == ' ') {
                isFirst = true;
            }
        }


        // return sb.toString();

    }
}
