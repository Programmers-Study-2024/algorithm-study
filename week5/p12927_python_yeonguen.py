# 야근 지수

import heapq
def solution(n, works):
    # 남은 일의 작업량을 최소화하기 위해선, 가장 일이 큰 값부터 처리해줘야한다. n-1 할때마다 정렬이 필요하다. heap 활용
    if n >= sum(works):
        return 0
    
    answer = 0
    works = [-w for w in works] # 마이너스 이용해서, heap 내림차순 정렬 효과
    heapq.heapify(works) # heap 변환
    
    while n > 0:
        max_val = heapq.heappop(works) # 가장 왼쪽값 = 최댓값(예. -4)
        heapq.heappush(works,max_val+1) # 1시간 일하기. max_val+1 추가후 자동정렬됨
        n -= 1
        
    for w in works:
        answer += w**2    
    return answer
