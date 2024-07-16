package week2;

public class p12934_java_minsu {

    public static void main(String[] args){
        // 문제 설명
        // 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        // n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        //사전변수 설정 Start
        long n = 121;
        //사전변수 설정 End

        //return ( Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n)+1,2) : -1);
        System.out.print("return 값 : " + ( Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n)+1,2) : -1));



    }
}
