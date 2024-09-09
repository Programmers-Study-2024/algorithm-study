# 동영상 재생기

def solution(video_len, pos, op_start, op_end, commands):
    # 시간 -> 초
    def seconds(time_str):
        minutes, seconds = map(int, time_str.split(':'))
        return minutes * 60 + seconds

    # 초 -> mm:ss 
    def time(seconds):
        minutes = seconds // 60
        seconds = seconds % 60
        return f"{minutes:02}:{seconds:02}"

    current = seconds(pos)
    video_end = seconds(video_len)
    start = seconds(op_start)
    end = seconds(op_end)

    # 명령을 하나씩 처리
    for command in commands:
        if start <= current <= end:
            current = end

        if command == "next":
            current += 10
            if current > video_end:
                current = video_end
        elif command == "prev":
            current -= 10
            if current < 0:
                current = 0

        if start <= current <= end :
            current = end

    # 최종 시간을 mm:ss 형식으로 변환하여 반환
    return time(current)
