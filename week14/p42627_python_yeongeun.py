# 디스크 컨트롤러

import heapq

def solution(jobs):
    # 전체 걸린 시간, 현재 시간, 인덱스
    answer,now,i = 0,0,0
    start = -1 # 디스크의 시작 위치
    heap = []
    
    while i < len(jobs):
        
        # 현재 시점에서 처리할 수 있는 작업을 heap에 저장        
        for j in jobs:
            if start < j[0] <= now:
                # 작업 소요 시간을 기준으로 자동 정렬해야 시간 줄일 수 있다!
                heapq.heappush(heap,[j[1],j[0]]) # 작업 소요 시간, 요청 시간
        
        # 처리할 작업이 있는 경우
        if len(heap) > 0:
            current = heapq.heappop(heap)
            start = now
            now += current[0] # 작업완료시점으로 이동
            
            # 작업 요청시간부터 종료시간까지의 시간 계산
            answer += (now-current[1])
            i += 1
            
        else:           
            # 처리할 작업이 없는 경우 다음 시간으로 넘어감
            now += 1

    return int(answer/len(jobs))
