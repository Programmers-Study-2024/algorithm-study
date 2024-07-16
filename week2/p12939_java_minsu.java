package week2;

public class p12939_java_minsu {
    public static void main(String arg[]){
        // 문제 설명
        //문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 
        // 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
        // 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

        //사전변수 설정 Start
        String s = "-1 -2 -3 -4";
        //사전변수 설정 End

        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(num < min) min = num;
            if(num > max) max = num;
        }

        // return min + " " + max;
        System.out.print("return 값 : " + min + " " + max);


    }
}
