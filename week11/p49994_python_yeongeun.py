# 방문 길이

def solution(dirs):
    sets = set() # 이동경로 저장 + 중복제거
    move = {'U':(0,1),'D':(0,-1),'R':(1,0),'L':(-1,0)}
    x,y = 0,0 # 시작점
    
    for d in dirs:
        dx,dy = move[d] 
        nx = x + dx
        ny = y + dy
        
        if -5 <= nx <= 5 and -5<= ny <= 5: # 경계선
            # (x,y) <-> (nx,ny)
            sets.add(((x,y),(nx,ny)))
            sets.add(((nx,ny),(x,y)))
            x = nx
            y = ny

    return len(sets)//2 # 단방향 = 양방향개수//2
