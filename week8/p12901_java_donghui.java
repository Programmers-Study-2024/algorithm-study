package week8;

public class p12901_java_donghui {

    // 1,3,5,7,8,10,12 = 31일 4,6,9,11 = 30일 2 = 29일
    public String solution(int a, int b) {
        String answer = "";
        int[] month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int sum = 0;
        for (int i = 0; i < a - 1; i++) {           // a월 1 일까지 총 합
            sum += month[i];
        }

        int idx = (sum + b) % 7;
        answer = day[idx];


        return answer;
    }
}
