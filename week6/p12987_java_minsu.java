package week6;

import java.util.Arrays;

public class p12987_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // xx 회사의 2xN명의 사원들은 N명씩 두 팀으로 나눠 숫자 게임을 하려고 합니다. 두 개의 팀을 각각 A팀과 B팀이라고 하겠습니다. 
        // 숫자 게임의 규칙은 다음과 같습니다.

        // 먼저 모든 사원이 무작위로 자연수를 하나씩 부여받습니다.
        // 각 사원은 딱 한 번씩 경기를 합니다.
        // 각 경기당 A팀에서 한 사원이, B팀에서 한 사원이 나와 서로의 수를 공개합니다. 그때 숫자가 큰 쪽이 승리하게 되고, 
        // 승리한 사원이 속한 팀은 승점을 1점 얻게 됩니다.
        // 만약 숫자가 같다면 누구도 승점을 얻지 않습니다.
        // 전체 사원들은 우선 무작위로 자연수를 하나씩 부여받았습니다. 
        // 그다음 A팀은 빠르게 출전순서를 정했고 자신들의 출전 순서를 B팀에게 공개해버렸습니다. 
        // B팀은 그것을 보고 자신들의 최종 승점을 가장 높이는 방법으로 팀원들의 출전 순서를 정했습니다. 이때의 B팀이 얻는 승점을 구해주세요.
        // A 팀원들이 부여받은 수가 출전 순서대로 나열되어있는 배열 A와 i번째 원소가 B팀의 i번 팀원이 부여받은 수를 의미하는 배열 B가 주어질 때, 
        // B 팀원들이 얻을 수 있는 최대 승점을 return 하도록 solution 함수를 완성해주세요.

        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};

        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        // A, B 배열 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        int idxA = 0;
        int idxB = 0;

        // B팀의 선수들이 A팀의 선수들과 대결하면서 이길 수 있는 경우를 찾습니다.
        while (idxB < B.length && idxA < A.length) {
            // B팀의 idxB번째 선수가 A팀의 idxA번째 선수보다 크면 승점 획득
            if (B[idxB] > A[idxA]) {
                answer++;
                idxA++; // A팀의 다음 선수로 이동
            }
            idxB++; // B팀의 다음 선수로 이동
        }

        return answer;
    }

}
