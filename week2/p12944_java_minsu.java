package week2;

import java.util.Arrays;

public class p12944_java_minsu {
    public static void main(String arg[]){
        //문제설명
        // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
        
        //사전변수 설정 Start
        int[] arr = {1,2,3,4};
        //사전변수 설정 End

        //return Arrays.stream(arr).average().getAsDouble();
        System.out.print("return 값 : " + Arrays.stream(arr).average().getAsDouble());
    }

}
