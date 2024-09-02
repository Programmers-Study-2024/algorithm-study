package week9;

public class p136798_java_donghui {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int attack = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) attack++;
                else if (i % j == 0) attack += 2;
            }
            if (attack > limit) attack = power;

            answer += attack;
        }


        return answer;
    }
}
