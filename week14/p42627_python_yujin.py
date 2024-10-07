# 디스크 컨트롤러

import heapq

def solution(jobs):
    answer = 0
    start,now =-1, 0
    job=0
    heap=[]
    
    while job < len(jobs):
        for clock,time in jobs:
            if start< clock <=now:
                heapq.heappush(heap,[time,clock])     
        
        if heap:
            time,clock = heapq.heappop(heap)
            start = now
            now += time
            answer += now-clock
            job+=1
        else : 
            now+=1
    
    return answer//len(jobs)
