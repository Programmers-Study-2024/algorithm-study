# 이중우선순위큐

import heapq
def solution(operations):
    answer = []
    
    heap = []
    for operation in operations:
        x, num = operation.split() 
        num = int(num)
        
        if x == 'I':
            heapq.heappush(heap, num)
        elif x == 'D' and num == 1:
            if len(heap) != 0:
                max_value = max(heap)
                heap.remove(max_value) # 최대값 삭제
        else:
            if len(heap) != 0: 
                heapq.heappop(heap) # 최솟값 삭제
    
    if len(heap) == 0:
        answer = [0, 0]
    else:
        answer = [max(heap), heapq.heappop(heap)]
        
    return answer
