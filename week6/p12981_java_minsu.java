package week6;

import java.util.ArrayList;
import java.util.List;

public class p12981_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.

        // 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
        // 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
        // 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
        // 이전에 등장했던 단어는 사용할 수 없습니다.
        // 한 글자인 단어는 인정되지 않습니다.
        // 다음은 3명이 끝말잇기를 하는 상황을 나타냅니다.

        // tank → kick → know → wheel → land → dream → mother → robot → tank

        // 위 끝말잇기는 다음과 같이 진행됩니다.

        // 1번 사람이 자신의 첫 번째 차례에 tank를 말합니다.
        // 2번 사람이 자신의 첫 번째 차례에 kick을 말합니다.
        // 3번 사람이 자신의 첫 번째 차례에 know를 말합니다.
        // 1번 사람이 자신의 두 번째 차례에 wheel을 말합니다.
        // (계속 진행)
        // 끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.

        // 사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 
        // 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};


                int[] answer = new int[2];

        int turn = 2; // 턴을 나타내는 변수 (초기값은 2부터 시작)
        int round = 1; // 라운드를 나타내는 변수 (초기값은 1부터 시작)
        String previous = words[0]; // 이전 단어를 저장할 변수

        // 이미 나온 단어를 체크하는 리스트
        List<String> check = new ArrayList<>();
        check.add(previous); // 첫 단어 추가

        // 끝말잇기 시작
        for (int i = 1; i < words.length; i++) {
            String current = words[i]; // 현재 단어

            // 단어의 길이가 1 이하이면 끝냄
            if (current.length() <= 1) {
                break;
            }

            // 이미 나온 단어라면 끝냄
            if (check.contains(current)) {
                break;
            }

            // 이전 단어의 끝과 현재 단어의 시작이 다르면 끝냄
            if (previous.charAt(previous.length() - 1) != current.charAt(0)) {
                break;
            }

            turn++; // 턴 증가
            previous = current; // 이전 단어 업데이트
            check.add(previous); // 현재 단어를 리스트에 추가

            // 모든 턴이 끝났을 경우
            if (turn > n) {
                turn = 1;
                round++;
            }

            // 모든 턴과 라운드가 탈락자 없이 끝났을 경우
            if (i == words.length - 1) {
                turn = 0;
                round = 0;
            }
        }

        answer[0] = turn;
        answer[1] = round;
        
        return answer;
    }
}