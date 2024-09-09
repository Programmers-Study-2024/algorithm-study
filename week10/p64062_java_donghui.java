package week10;

public class p64062_java_donghui {
    public int solution(int[] stones, int k) {
        int left = 1;
        int right = 200000000 + 200000;              // 건널 수 있는 인원 최대 2억 2십만..?
        int mid = (left + right) / 2;         // 최대 갈수 있는 인원 수
        while (left <= right) {
            if (road(stones, mid, k)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = (left + right) / 2;
        }

        return mid;
    }

    static boolean road(int[] stones, int friends, int k) {
        int count = 0;          // 한번에 건널 수 없는 디딤돌 수 카운트
        for (int j = 0; j < stones.length; j++) {
            if (stones[j] - friends < 0) count++;
            else count = 0;

            if (count == k) return false;
        }


        return true;


    }

}
