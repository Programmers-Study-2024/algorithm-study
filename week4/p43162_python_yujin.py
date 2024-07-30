# 네트워크

def solution(n, computers):
    answer = 0
    visited = [False]*n
    
    for i in range(n):
        if not visited[i]:
            DFS(n,computers,i,visited)
            answer+=1
    return answer

def DFS(n,computers,x,visited):
    visited[x] = True
    
    for node in range(n) :
        if (x==node) : continue
        if computers[x][node]==1 and not visited[node] : 
            DFS(n,computers,node,visited)
    return 
