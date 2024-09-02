package week9;

public class p92335_java_donghui {
    public int solution(int n, int k) {
        int answer = 0;


        String str = Long.toString(n, k);         // 진수 변환

        String[] arr = str.split("0");

//        System.out.println(Arrays.toString(arr));


        // 약수인지 아닌지 구하기
        // 여기서 1번 시간초과 => 안에 for문때문에!
        for (String s : arr) {
            if (s.equals("")) continue;
            boolean flag = false;
            Long num = Long.parseLong(s);
            int number = (int) Math.sqrt(num) + 1;
            if (num == 1) flag = true;
            for (int j = 2; j < number; j++) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) answer++;
        }

        return answer;
    }
}
