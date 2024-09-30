package week13;

import java.util.ArrayList;
import java.util.Collections;

public class p17686_java_donghui {
    public String[] solution(String[] files) {
        ArrayList<Point> arr = new ArrayList<>();

        for(int i =0;i<files.length;i++) {
            int idx = 0;
            String file = files[i];
            String h;
            String num;

            // head 와 number 분리
            while(true) {
                if(file.charAt(idx) >= '0' && file.charAt(idx) <= '9') break;
                idx++;
            }
            h = file.substring(0,idx);
            int next= idx;
            while(true) {
                if(next >= file.length()) break;                // tail 뒤에 아무것도 없을 수도 있다는 말 주의
                if(file.charAt(next) < '0' || file.charAt(next) > '9') break;
                next++;
            }

            num = file.substring(idx,next);

            // 대소구분 없다는 말 주의
            arr.add(new Point(file,h.toLowerCase(),Integer.parseInt(num),i));
        }

        Collections.sort(arr);

        String[] answer = new String[arr.size()];
        for(int j = 0;j<arr.size();j++) {
            answer[j] = arr.get(j).s;
        }

        return answer;
    }
}

class Point implements Comparable<Point> {
    String s;
    String head;
    int number;
    int n;
    public Point(String s,String head,int number, int n) {
        this.s = s;
        this.head = head;
        this.number = number;
        this.n =n;}

    @Override
    public int compareTo(Point po) {
        if(this.head.equals(po.head)) {
            if(this.number == po.number) return this.n - po.n;


            return this.number - po.number;
        }


        return this.head.compareTo(po.head);
    }

}
