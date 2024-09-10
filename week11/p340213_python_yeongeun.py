# [PCCP 기출문제] 1번 / 동영상 재생기


def solution(video_len, pos, op_start, op_end, commands):
    # 초기값 세팅
    m,s = map(int,pos.split(":"))
    video_m, video_s = map(int,video_len.split(":"))
    op_start_m, op_start_s = map(int,op_start.split(":"))
    op_end_m, op_end_s = map(int,op_end.split(":"))
    
    # 오프닝 건너뛰기
    if m < op_end_m :
        if (op_start_m == m and op_start_s <= s) or (op_start_m < m):
            m,s = op_end_m, op_end_s
    elif m == op_end_m and s < op_end_s:
        if (op_start_m == m and op_start_s <= s) or (op_start_m < m):
            m,s = op_end_m, op_end_s
            
    for c in commands:
        if c == "prev":
            if s-10 < 0 and m >= 1:
                m -= 1
                s = 60+(s-10)
            else:
                s = max(0,s-10)
        elif c == "next":
            if s+10 >= 60 and m < video_m:
                m += 1
            if m == video_m:
                s = min((s+10)%60, video_s)
            else:
                s = (s+10)%60
            
        # 오프닝 건너뛰기
        if m < op_end_m :
            if (op_start_m == m and op_start_s <= s) or (op_start_m < m):
                m,s = op_end_m, op_end_s
        elif m == op_end_m and s < op_end_s:
            if (op_start_m == m and op_start_s <= s) or (op_start_m < m):
                m,s = op_end_m, op_end_s

    answer = "0" * (2-len(str(m))) + str(m) + ":" + "0" * (2-len(str(s))) + str(s)
    return answer
