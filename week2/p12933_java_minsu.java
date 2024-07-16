package week2;

import java.util.Arrays;
import java.util.Collections;

public class p12933_java_minsu {

    public static void main(String[] args){
        // 문제 설명
        // 함수 solution은 정수 n을 매개변수로 입력받습니다.
        // n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        // 예를들어 n이 118372면 873211을 리턴하면 됩니다.

        //사전변수 설정 Start
        long n = 118372;
        //사전변수 설정 End

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        String[] temp = sb.toString().split("");
        
        Arrays.sort(temp,Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i < temp.length ; i++){
            answer.append(temp[i]);
        }

        // return Long.parseLong(answer.toString());
        System.out.print("return 값 : " + Long.parseLong(answer.toString()));



    }

}
