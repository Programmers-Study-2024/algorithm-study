# 방문 길이

def solution(dirs):
    xy=set()
    x,y=0,0
    UDRL = {'U':(0,1),'D':(0,-1),'R':(1,0),'L':(-1,0)}
    
    for i in dirs :
        dx,dy=UDRL[i]
        nx=x+dx
        ny=y+dy
        
        if -5<=nx<=5 and -5<=ny<=5 :
            xy.add(((x,y),(nx,ny)))
            xy.add(((nx,ny),(x,y)))
            x,y=nx,ny
            
    return len(xy)//2
