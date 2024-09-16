package week11;
import java.util.*;
/**
 * lv 1
 * [PCCP 기출문제] 1번 / 동영상 재생기
 */
public class p340213_java_harin {
    class Solution {
        // "mm:ss" 형식의 시간을 초 단위로 변환하는 함수
        private int timeToSeconds(String time) {
            String[] parts = time.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            return minutes * 60 + seconds;
        }

        // 초 단위를 다시 "mm:ss" 형식으로 변환하는 함수
        private String secondsToTime(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }

        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            // 각 시간을 초 단위로 변환
            int videoLength = timeToSeconds(video_len);
            int currentPos = timeToSeconds(pos);
            int opStart = timeToSeconds(op_start);
            int opEnd = timeToSeconds(op_end);

            // 각 명령어에 대한 처리
            for (String command : commands) {
                if (currentPos >= opStart && currentPos <= opEnd) {
                    currentPos = opEnd;
                }
                if (command.equals("next")) {
                    currentPos = Math.min(currentPos + 10, videoLength);
                }
                if (command.equals("prev")) {
                    currentPos = Math.max(currentPos - 10, 0);
                }
                if (currentPos >= opStart && currentPos <= opEnd) {
                    currentPos = opEnd;
                }
            }

            // 결과를 "mm:ss" 형식으로 반환
            return secondsToTime(currentPos);
        }
    }

}
