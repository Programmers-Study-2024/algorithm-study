package week1;

public class p12928_java_minsu {
    public static void main(String[] args){
//        문제 설명
//        정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//
//                제한 사항
//        n은 0 이상 3000이하인 정수입니다.

//        사전변수 설정 Start
        int n = 12;
//        사전변수 설정 End

        int answer = 0;
        int a = (n / 2) + 1;
        for (int i = 1; i < a; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }
        answer = answer + n;
//        return answer;
        System.out.println(answer);


    }
}
