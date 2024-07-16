package week2;

import java.util.Arrays;

public class p12932_java_minsu {

    public static void main(String[] args){

//        문제 설명
        // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        // 제한 조건
        // n은 10,000,000,000이하인 자연수입니다.

//        사전변수 설정 Start   
        long n = 12345;
//        사전변수 설정 End


        StringBuilder answer = new StringBuilder();
        answer.append(n).reverse();
        String[] temp = answer.toString().split("");

        int[] aw = new int[temp.length];
        for(int i = 0 ; i< temp.length;i++){
            aw[i] = Integer.parseInt(temp[i]);
        }
        // return aw;
        System.out.print("return 값 : " + Arrays.toString(aw));

    }

}
