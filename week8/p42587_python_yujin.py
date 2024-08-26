# 프로세스

from collections import deque

def solution(priorities, location):
    answer = 0
    p=deque(priorities)
    
    while len(p)>0 :
        M=max(p)
        tmp=p.popleft()
        location-=1
        
        if tmp != M :
            p.append(tmp)
            if location == -1 :
                location = len(p)-1
        else :
            answer+=1
            if location == -1: break
    return answer
