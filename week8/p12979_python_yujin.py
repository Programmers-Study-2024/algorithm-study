# 기지국 설치

def solution(n, stations, w):
    answer = 0
    need=[]
    
    # 처음 기지국 전 송파 X 범위
    if(stations[0]-w-1) > 0 :
        need.append(stations[0]-w-1)
    #print(need)
    
    # 마지막 기지국 후 송파 X 범위
    if(n-stations[-1]-w) > 0 :
        need.append(n-stations[-1]-w)
    #print(need)
    
    # 그 사이 송파 X 범위
    for i in range (len(stations)-1):
        tmp=stations[i+1]-stations[i]-1
        tmp-= 2*w
        if tmp > 0:
            need.append(tmp)        
    #print(need)
    
    # 기지국 개수
    for i in need :
        answer += i//(w*2+1)
        if i%(w*2+1) != 0 :
            answer+=1
            
    return answer
