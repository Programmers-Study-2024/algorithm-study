# 숫자 변환하기

from collections import deque

def solution(x, y, n):
    
    # dfs
    queue = deque()
    queue.append((x,0)) # 값, 횟수
    visited = set() # 방문여부
    
    while queue:
        i,j = queue.popleft()
        if i > y or i in visited: # y 초과 or 이미 방문
            continue
        visited.add(i)
        
        if i == y:
            return j
        else:
            for k in (i+n, i*2, i*3):
                if k <= y and k not in visited:
                    queue.append((k,j+1))

    return -1
