package week6;
/**
 * lv 2
 * 예상 대진표
 * 첫 번째 라운드에서 4번 참가자는 3번 참가자와 붙게 되고,
 * 7번 참가자는 8번 참가자와 붙게 됩니다.
 * 항상 이긴다고 가정했으므로 4번 참가자는 다음 라운드에서 2번이 되고, 7번 참가자는 4번이 됩니다.
 * 두 번째 라운드에서 2번은 1번과 붙게 되고, 4번은 3번과 붙게 됩니다. 항상 이긴다고 가정했으므로 2번은 다음 라운드에서 1번이 되고, 4번은 2번이 됩니다.
 * 세 번째 라운드에서 1번과 2번으로 두 참가자가 붙게 되므로 3을 return
 */
public class p12985_java_harin {
    class Solution
    {
        public int solution(int n, int a, int b)
        {
            int count = 0;
            while (true){
                a = a / 2 + a % 2;
                b = b / 2 + b % 2;
                count++;
                if (a == b) break;
            }
            return count;
        }
    }
}
