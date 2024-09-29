# 전력망을 둘로 나누기

from collections import deque

def solution(n, wires):
    answer = n-2
    
    def bfs(start):
        # 초기 상태
        visited = [0] * (n + 1)
        q = deque([start])
        visited[start] = 1
        cnt = 1    

        # 노드 개수 구하기
        while q:
            s = q.popleft()
            for i in graph[s]:
                if visited[i]==0 :
                    q.append(i)
                    visited[i] = 1
                    cnt += 1    
        return cnt

    # 연결리스트
    graph = [[] for _ in range(n + 1)]
    for a, b in wires:
        graph[a].append(b)
        graph[b].append(a)

    # 끊기
    for a, b in wires:
        graph[a].remove(b)
        graph[b].remove(a)

       # 최소값구하기
        answer = min(abs(bfs(a) - bfs(b)), answer)
        
        graph[a].append(b)
        graph[b].append(a)

    return answer
