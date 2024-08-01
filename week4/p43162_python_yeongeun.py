# 네트워크

def solution(n, computers):
    answer = 0
    visited = [False for i in range(n)] # 방문여부
    for com in range(n):
        if viisted[com] == False : # com 방문하지 않았다면
            DFS(n, computers, com, visited)
            answer += 1 # 네트워크 추가
    return answer

def DFS(n, computers, com, visited):
    visited[com] = True # 방문처리
    for connect in range(n):
        # 두 컴퓨터가 같은 컴퓨터가 아니고, 서로 연결되어있다면
        if connect != com and computers[com][connect] == 1:
            if visited[connect] == False: # connect 방문하지 않았다면
                DFS(n, computers, connect, visited) # connect 방문       
