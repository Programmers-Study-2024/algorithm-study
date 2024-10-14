# 게임 맵 최단거리

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
  
    q=[]
    q.append((0,0))
    
    while len(q) > 0 :
        map = q.pop(0)
        
        for i in range(4):
            x= map[0] + dx[i]
            y= map[1] + dy[i]
            
            if not (0<=x<n) or not (0<=y<m) :
                continue
            if (x==0 and y==0) or maps[x][y]==0 :
                continue
            if maps[x][y]==1:
                maps[x][y] += maps[map[0]][map[1]]
                q.append((x,y))
            else : 
                maps[x][y] = min(maps[x][y], maps[map[0]][map[1]]+1)
              
    if maps[n-1][m-1]==1:
        return -1
        
    return maps[n-1][m-1]
