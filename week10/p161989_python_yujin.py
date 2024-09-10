# 덧칠하기

def solution(n, m, section):
    answer = 0
    p = 0
    
    for s in section:
        if s>p:
            p = s+m-1
            answer+=1
    return answer
