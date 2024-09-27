# 전력망을 둘로 나누기

from collections import deque

def solution(n, wires):

    # 송전탑 서로 연결시켜주기
    graph = [[] for _ in range(n+1)]
    for a,b in wires:
        graph[a].append(b)
        graph[b].append(a)
    
    # 해당 노드랑 연결된 전선 개수 count
    def bfs(start):
        visited = [0]*(n+1)
        q = deque([start])
        visited[start] = 1
        cnt = 1
        while q:
            s = q.popleft()
            for i in graph[s]:
                if not visited[i]:
                    q.append(i)
                    visited[i] = 1
                    cnt += 1
        return cnt
    
    answer = n
    for a,b in wires:
        # 끊어줌
        graph[a].remove(b)
        graph[b].remove(a)
        
        # a / b 두 집단 연결된 전선 구하기
        answer = min(abs(bfs(a)-bfs(b)),answer)
        
        # 붙여줌
        graph[a].append(b)
        graph[b].append(a)        
    
    return answer
