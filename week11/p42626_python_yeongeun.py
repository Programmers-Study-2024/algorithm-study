# 더 맵게

import heapq

def solution(scoville, K):
    heap = []
    cnt = 0
    for i in scoville:
        heapq.heappush(heap,i)
    
    while heap[0] < K:
        try:
            heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap)*2)
        except IndexError :
            return -1
        cnt += 1
        
    return cnt
