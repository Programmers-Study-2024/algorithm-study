package week7;

public class p81301_java_donghui {
    public int solution(String s) {
        int answer = 0;

        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        String str = "";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {           // s 가 숫자일때
                ans += c + "";
                continue;
            }

            str += c + "";
            if (map.containsKey(str)) {          // 키가 있는지 확인
                ans += map.get(str);
                str = "";
            }

        }

        answer = Integer.parseInt(ans);

        return answer;
    }

}
