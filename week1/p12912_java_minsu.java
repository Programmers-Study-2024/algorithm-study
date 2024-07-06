package week1;

public class p12912_java_minsu {
    public static void main(String[] args){
//        문제 설명 
//        두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//                예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//        제한 조건
//        a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//                a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//        a와 b의 대소관계는 정해져있지 않습니다.

//        사전변수 설정 Start
        int a = 3;
        int b = 5;
//        사전변수 설정 End

        int temp = 0;

        if(a < b){
            temp = b;
            b = a;
            a = temp;
        }

        long answer = 0;

        for(int i = b ; i <= a ; i++ ){
            answer = answer + i;
        }

//        return answer;
        System.out.println("return 값 : " + answer);




    }
}
