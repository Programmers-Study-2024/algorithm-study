# 네트워크

def solution(n, computers):
    answer = 0
    visited = [False for _ in range(n)] # 방문여부    
    for com in range(n):
        if visited[com] == False: # 방문하지 않았어야 함
            DFS(n, computers, com, visited)
            answer += 1            
    return answer
            
def DFS(n, computers, com, visited):
    visited[com] = True # 방문처리
    for connect in range(n):
        # 두 컴퓨터가 같은 컴퓨터가 아니고, 서로 연결되어있다면
        if connect != com and computers[com][connect] == 1:
            if visited[connect] == False: # connect 방문하지 않았따면
                DFS(n, computers, connect, visited)
                
# com에 연결된 모든 connect에 한개씩 방문. connect에 연결된 모든 connect 한개씩 방문...
# 계속 깊게 파고드는 DFS 재귀 형태로 풀이
# 모두 방문해서 더이상 방문할 곳이 없다면, 네트워크 추가 answer += 1
