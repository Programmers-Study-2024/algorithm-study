# 숫자 변환하기

from collections import deque

def solution(x, y, n):
    # dfs 풀이법
    queue = deque()
    queue.append((x,0)) # 시작 = 값,횟수
    visited = set() # 방문여부 = 이미 나온 값 저장해주기
    
    while queue:
        i,j = queue.popleft()
        if i > y or i in visited:
            continue
        visited.add(i)
        
        if i == y : # 변환완료
            return j
        for k in (i*3,i*2,i+n): # 세개 모두 탐방
            if k <= y and k not in visited:
                queue.append((k,j+1))
        
    return -1
