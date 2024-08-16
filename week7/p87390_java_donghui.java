package week7;

public class p87390_java_donghui {
    // 1234    - 0~3
    // 2234    - 4~7
    // 3334    - 8~11
    // 4444    - 12~14
    ArrayList<Long> arr;
    public int[] solution(int n, long left, long right) {


        int[] answer = new int[(int)(right-left)+1];
        int idx = 0;
        for(long i = left;i<=right;i++) {
            answer[idx] = (int)Math.max(i/n,i%n)+1;
            idx++;
        }



        return answer;
    }
}
