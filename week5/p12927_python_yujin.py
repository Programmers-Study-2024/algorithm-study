# 야근 지수

import heapq

def solution(n, works):
    if n >= sum(works): return 0

    answer = 0
    # 최대 힙을 만들기 위해 -1를 곱해줌
    works = [-1 * work for work in works]
    # works를 heap으로 변환
    heapq.heapify(works)
    
    # 일처리
    while(n>0):
        num = heapq.heappop(works)
        num += 1
        heapq.heappush(works, num)
        n-=1
        
    return sum([i**2 for i in works])
