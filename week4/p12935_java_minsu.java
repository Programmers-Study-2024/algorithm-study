package week4;

public class p12935_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
        // 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, 
        // [10]면 [-1]을 리턴 합니다.

        int[] arr = {4,3,2,1};
        
        int[] answer = {};

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];
            int min = arr[0];
            int minIndex = 0;
            for(int i=1; i<arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            for(int i=0; i<minIndex; i++) {
                answer[i] = arr[i];
            }
            for(int i=minIndex+1; i<arr.length; i++) {
                answer[i-1] = arr[i];
            }
        }

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }

        //return answer;
    }

}
