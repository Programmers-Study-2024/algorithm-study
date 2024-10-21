# 공원 산책

def solution(park, routes):
    x,y=0,0
    xy = {'N':(-1,0), 'S':(1,0), 'W':(0,-1), 'E':(0,1)}
    
    for row in range(len(park)):
        for col in range(len(park[0])):
            if park[row][col] == 'S':
                x,y=row,col
    
    for i in routes :
        way,n = i.split(' ')[0], int(i.split(' ')[1])
        dx,dy = xy[way]
        
        tmp_x,tmp_y=x,y
        TF=True
        
        for _ in range(n):
            nx= tmp_x + dx
            ny= tmp_y + dy
            
            if 0 <= nx <= len(park)-1 and 0 <= ny <= len(park[0])-1 and park[nx][ny] != 'X' :
                tmp_x,tmp_y=nx,ny
            else :
                TF=False
                break
        
        if TF :
            x,y=nx,ny
        
    return [x,y]
