# 가장 먼 노드

from collections import deque

def solution(n, edge):
    answer = 0
    graph = [[] for _ in range(n+1)]
    distance = [-1] * (n+1)
    
    # 각 인덱스별 연결된 노드들 추가
    for e in edge:
        graph[e[0]].append(e[1])
        graph[e[1]].append(e[0])
    # print(graph)
    # [[],[3,2],[3,1,4,5],[6,4,2,1],[3,2],[2],[3]]
    
    # 1번 노드에서 시작
    queue = deque([1])
    distance[1] = 0
    
    while queue:
        now = queue.popleft()
        # now 노드와 연결된 모든 노드 탐방
        for i in graph[now]:
            if distance[i] == -1: # 방문 아직 안한 경우
                queue.append(i)
                distance[i] = distance[now] + 1 # 현재까지 연결된 노드개수+1    
    # print(distance)
    # [-1,0,1,1,2,2,2]   
    
    # 가장 멀리 떨어진 노드 개수 구하기
    for d in distance:
        if d == max(distance):
            answer += 1
    
    return answer
