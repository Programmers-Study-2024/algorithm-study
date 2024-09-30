# 가장 먼 노드

from collections import deque

def solution(n, edge):
    answer = 0    
    graph = [[] for _ in range(n+1)]
    distance = [-1] * (n+1)
    
    for e in edge:
        graph[e[0]].append(e[1])
        graph[e[1]].append(e[0])
        
    queue = deque([1])
    distance[1] = 0
    
    while queue:
        now = queue.popleft()
        for i in graph[now]:
            if distance[i] == -1:
                queue.append(i)
                distance[i] = distance[now] + 1
    
    m = max(distance)    
    for d in distance:
        if d == m:
            answer += 1
    
    return answer
