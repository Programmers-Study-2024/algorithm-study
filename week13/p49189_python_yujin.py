# 가장 먼 노드

def solution(n, edge):
    # 연결리스트
    adj=[[] for _ in range(n+1)]
    for a,b in edge:
        adj[a].append(b)
        adj[b].append(a)
        
    # 방문 체크 + 간선 개수
    V=[-1]*(n+1)
    V[1]=0
    queue=[1]
    
    #BFS
    while queue :
        a = queue.pop(0)
        for b in adj[a]:
            if V[b]==-1 :
                V[b]=V[a]+1
                queue.append(b)

    return V.count(max(V))
