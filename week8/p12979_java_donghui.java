package week8;

public class p12979_java_donghui {
    // 테스트 다 맞는데 효율성테스트 다 시간초과 ... for 문 한번만 도는데에도 시간초과는 왜지..?
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int size = 2 * w + 1;

        // 아파트에 stations 배열에 맞게 다 설치

        int s = 1;
        int e;
        int empty;
        for (Integer station : stations) {

            e = station - w;
            empty = e - s;

            if (empty > 0) {
                int apartment = empty / size;
                answer += apartment;

                if (empty % size != 0) answer += 1;
            }
            s = station + w + 1;

        }

        // 마지막에 도달못한 전파가 있는 경우
        if (stations[stations.length - 1] + w < n) {
            s = stations[stations.length - 1] + w;
            e = n;
            empty = e - s;
            if (empty > 0) {
                int apartment = empty / size;
                answer += apartment;

                if (empty % size != 0) answer += 1;

            }
        }


        return answer;
    }
}
