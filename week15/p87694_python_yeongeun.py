# 아이템 줍기

from collections import deque

def solution(rectangle, characterX, characterY, itemX, itemY):
    answer = 0
    
    # 제한사항 1~50 2배의 좌표
    field = [[-1]*102 for i in range(102)]
    
    # 2차원 배열 만들어서 직사각형 그리기, 내부는 0, 테두리는 1로 채운다
    for r in rectangle:
        x1,y1,x2,y2 = map(lambda x:x*2,r)
        for i in range(x1,x2+1): # x좌표
            for j in range(y1,y2+1): #y좌표
                if x1<i<x2 and y1<j<y2:
                    field[i][j] = 0
                elif field[i][j] != 0:
                    field[i][j] = 1

    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    
    # 큐에 캐릭터 출발지점 추가 & 최단거리를 적어줄 visited 배열 선언
    q = deque()
    q.append([characterX * 2, characterY * 2]) # 초기 캐릭터 위치 characterX
    visited = [[1] * 102 for i in range(102)]
    
    while q:
        x, y = q.popleft()
        # 도착한 곳이 아이템 있는 장소라면,
        # 현재의 최단거리//2 후 break(while문 빠져나옴)
        if x == itemX * 2 and y == itemY * 2:
            answer = visited[x][y] // 2
            break
        # 도착한 곳이 아이템이 없다면, 상하좌우 네 방향으로 이동
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            # 현재 좌표가 테두리이고 아직 방문하지 않은 곳이라면 q에 추가 후 visited 최단거리로 갱신
            if field[nx][ny] == 1 and visited[nx][ny] == 1:
                q.append([nx, ny])
                visited[nx][ny] = visited[x][y] + 1
    
    return answer
