# 네트워크

def solution(n, computers):
    answer = 0
    visited=[False]*n
    
    for i in range(n):
        if not visited[i]:
            DFS(n,computers,i,visited)
            answer+=1
            
    return answer

def DFS(n,computers,i,visited):
    visited[i]=True
    
    for node in range(n):
        if i==node : 
            continue
        if computers[i][node]==1 and not visited[node] :
            DFS(n,computers,node,visited)
    return
            
