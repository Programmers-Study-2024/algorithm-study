# 덧칠하기

from collections import deque

def solution(n,m,section):
    
    answer = 0
    section = deque(section)
    
    while section:
        start = section.popleft()
        while section and start + m > section[0]: # 다음 영역까지 한번에 칠할 수 있다면,
            section.popleft() # 다음영역 삭제
        answer += 1
        
    return answer
    
