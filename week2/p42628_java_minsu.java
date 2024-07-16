package week2;

public class p42628_java_minsu {
    public static void main (String arg[]){
    
        // 문제 설명
        // 이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.

        // 명령어	수신 탑(높이)
        // I 숫자	큐에 주어진 숫자를 삽입합니다.
        // D 1	큐에서 최댓값을 삭제합니다.
        // D -1	큐에서 최솟값을 삭제합니다.
        // 이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0]
        // 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.

        // 제한사항
        // operations는 길이가 1 이상 1,000,000 이하인 문자열 배열입니다.
        // operations의 원소는 큐가 수행할 연산을 나타냅니다.
        // 원소는 “명령어 데이터” 형식으로 주어집니다.- 최댓값/최솟값을 삭제하는 연산에서 최댓값/최솟값이 둘 이상인 경우, 
        // 하나만 삭제합니다.
        // 빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시합니다.

        //사전변수 설정 Start
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        //사전변수 설정 End

        int[] answer = new int[2];
        int[] queue = new int[operations.length];
        int front = 0;
        int rear = 0;
        int size = 0;

        for (int i = 0; i < operations.length; i++) {
            String[] op = operations[i].split(" ");
            if (op[0].equals("I")) {
                queue[rear++] = Integer.parseInt(op[1]);
                size++;
            } else {
                if (size == 0) continue;
                if (op[1].equals("1")) {
                    int max = queue[front];
                    int maxIdx = front;
                    for (int j = front + 1; j < rear; j++) {
                        if (max < queue[j]) {
                            max = queue[j];
                            maxIdx = j;
                        }
                    }
                    queue[maxIdx] = queue[front];
                } else {
                    int min = queue[front];
                    int minIdx = front;
                    for (int j = front + 1; j < rear; j++) {
                        if (min > queue[j]) {
                            min = queue[j];
                            minIdx = j;
                        }
                    }
                    queue[minIdx] = queue[front];
                }
                front++;
                size--;
            }
        }

        if (size == 0) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            int max = queue[front];
            int min = queue[front];
            for (int i = front + 1; i < rear; i++) {
                if (max < queue[i]) max = queue[i];
                if (min > queue[i]) min = queue[i];
            }
            answer[0] = max;
            answer[1] = min;
        }

        // return answer;
        System.out.print("return 값 : " + answer[0] + " " + answer[1]);

    }
}
