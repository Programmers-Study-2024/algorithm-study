package week4;

public class p12910_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;


        int[] answer = {};
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;
            }
        }

        if(count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
            count = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] % divisor == 0) {
                    answer[count] = arr[i];
                    count++;
                }
            }
            for(int i=0; i<answer.length; i++) {
                for(int j=i+1; j<answer.length; j++) {
                    if(answer[i] > answer[j]) {
                        int temp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = temp;
                    }
                }
            }
        }

        //return answer;
        
        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }




    }
}
