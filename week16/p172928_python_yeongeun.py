# 공원 산책

def solution(park, routes):

    x = 0
    y = 0

    # 시작지점 S x,y 좌표 찾기
    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == "S":
                x = j
                y = i
    
    max_x = len(park[0]) - 1 #0부터 시작하니까 -1해주기
    max_y = len(park) - 1

    for route in routes:
        xx = x
        yy = y
        for step in range(int(route[2])): # "E 2" : E 방향으로 2만큼 움직이기
            # 0과 max_x,max_y 사이에 있어야함 & 이동할 곳에 장애물 X 없어야함
            if route[0] == "E" and xx != max_x and park[yy][xx+1] != "X":
                xx += 1 # 오른쪽 한칸씩 이동
                if step == int(route[2])-1: # 전부 이동했다면, 위치 저장
                    x = xx
                    
            elif route[0] == "W" and xx != 0 and park[yy][xx-1] != "X":
                xx -= 1 # 왼쪽 한칸씩 이동
                if step == int(route[2])-1:
                    x = xx
                    
            elif route[0] == "S" and yy != max_y and park[yy+1][xx] != "X":
                yy += 1 # 오른쪽 한칸씩 이동
                if step == int(route[2])-1:
                    y = yy
                    
            elif route[0] == "N" and yy != 0 and park[yy-1][xx] != "X":
                yy -= 1 # 왼쪽 한칸씩 이동
                if step == int(route[2])-1:
                    y = yy
                    
    return [y,x] # [세로방향좌표, 가로방향좌표]
