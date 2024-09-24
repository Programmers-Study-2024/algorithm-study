package week12;

import java.util.HashSet;
import java.util.Set;

public class p42895_java_donghui {
    public int solution(int N, int number) {
        int answer = -1;
        int num = N;
        Set<Integer>[] setArr = new HashSet[9];
        for (int i = 1; i < 9; i++) {
            setArr[i] = new HashSet<>();
            setArr[i].add(num);
            num = num * 10 + N;
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer num1 : setArr[j]) {
                    for (Integer num2 : setArr[i - j]) {
                        setArr[i].add(num1 + num2);
                        setArr[i].add(num1 - num2);
                        setArr[i].add(num1 * num2);
                        setArr[i].add(num2 - num1);
                        if (num1 != 0) {
                            setArr[i].add(num2 / num1);
                        }
                        if (num2 != 0) {
                            setArr[i].add(num1 / num2);
                        }
                    }
                }
            }
        }

        for (int i = 1; i < 9; i++) {
            if (setArr[i].contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}