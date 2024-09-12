# 가장 먼 노드

def solution(n, edge):
    # 인접노드 배열
    adj=[[] for _ in range(n+1)]
    for v1,v2 in edge:
        adj[v1].append(v2)
        adj[v2].append(v1)
    # 방문 체크 + 간선 개수
    V=[-1]*(n+1)
    V[1]=0
    #print(adj,V)
    
    queue=[1]
    
    #BFS
    while queue :
        v1 = queue.pop(0)
        for v2 in adj[v1]:
            if V[v2]==-1 :
                #print(v2)
                V[v2]=V[v1]+1
                queue.append(v2)
        #print(queue,V)
    return V.count(max(V))
