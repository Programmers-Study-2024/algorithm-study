package week12;

public class p92341_java_donghui {
    HashMap<String,Integer> parking = new HashMap<>();
    HashMap<String,Integer> parkingF = new HashMap<>();
    HashMap<String,Integer> cost = new HashMap<>();
        for(String record : records) {
        int time = HourToMinute(record.substring(0,6));
        String num = record.substring(6,10);
        if(!cost.containsKey(num)) cost.put(num,0);
        if(!parkingF.containsKey(num)) parkingF.put(num,0);

        if(record.substring(11).equals("IN")) {
            parking.put(num,time);
        } else {
            int t = time - parking.get(num);
            parkingF.put(num,parkingF.get(num) + t);
            parking.put(num,-1);
        }

    }

    // 끝까지 안나간 차량 계산
        for(String key :parking.keySet()) {
        if(parking.get(key) != -1) {
            int lastTime = HourToMinute("23:59")- parking.get(key);
            parkingF.put(key,parkingF.get(key) + lastTime);
        }
    }

        for(String key :parkingF.keySet()) {
        int money = parkingFee(fees,parkingF.get(key));
        cost.put(key,money);
    }

    int[] answer = new int[cost.size()];
    int idx = 0;
    PriorityQueue<Point> pq = new PriorityQueue<>();
        for(String k :cost.keySet()) {
        pq.add(new Point(k,cost.get(k)));

    }


        while(!pq.isEmpty()) {
        answer[idx] = pq.poll().f;
        idx++;
    }




        return answer;
}


    static int HourToMinute(String s) {
        int h = Integer.parseInt(s.substring(0,2)) * 60;
        int m = Integer.parseInt(s.substring(3,5));
        return h+m;
    }

    static int parkingFee(int[] fees,int t) {
        int money = fees[1];
        if(t > fees[0])  {
            t -= fees[0];
            int a = t / fees[2];
            int b = t % fees[2];

            if(a == 0) money = fees[1] + fees[3];
            else {
                money = fees[1] + fees[3] * a;
                if(b % fees[2] != 0) money += fees[3];
            }
        }

        return money;
    }

}



class Point implements Comparable<Point> {
    String n;
    int f;

    public Point(String n,int f) {
        this.n = n;
        this.f = f;
    }


    @Override
    public int compareTo(Point po) {
        return Integer.parseInt(this.n) - Integer.parseInt(po.n);
    }


}
