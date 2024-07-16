package week2;

public class p12947_java_minsu {
    public static void main(String arg[]){
        // 문제 설명
        // 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
        // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
        // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    
        //사전변수 설정 Start
        int x = 10;
        //사전변수 설정 End

        int sum = 0;
        int temp = x;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }

        // return (x % sum == 0 ? true : false);
        System.out.print("return 값 : " + (x % sum == 0 ? true : false));


    }
}
