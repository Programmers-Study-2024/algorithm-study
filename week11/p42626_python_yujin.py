# 더 맵게

import heapq

def solution(scoville, K):
    answer = 0
    heap = []
    for i in scoville:
        heapq.heappush(heap, i)
        
    while heap[0] < K:
        min1=heapq.heappop(heap)
        min2=heapq.heappop(heap)
        heapq.heappush(heap, min1 + min2 * 2)
        answer += 1
        
        if len(heap) == 1 and heap[0] < K:
            return -1
    return answer
