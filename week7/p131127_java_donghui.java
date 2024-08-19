package week7;

public class p131127_java_donghui {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {            // 10 일까지 세일 목록 넣기
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        for (int j = 9; j < discount.length; j++) {
            boolean flag = true;

            for (int k = 0; k < want.length; k++) {
                if (map.containsKey(want[k]) && map.get(want[k]) > 0) {      // 열흘안에 있는지 + 열흘안에 있는 수가 0 이상인지 확인
                    // 있으면 수량보다 많은지 확인
                    if (map.get(want[k]) < number[k]) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer += 1;
            }

            if (j + 1 < discount.length)
                map.put(discount[j + 1], map.getOrDefault(discount[j + 1], 0) + 1);     // 다음날꺼 추가
            if (map.get(discount[j - 9]) > 0) map.put(discount[j - 9], map.get(discount[j - 9]) - 1);      // 맨 앞의 날 감소


        }

        return answer;
    }
}
