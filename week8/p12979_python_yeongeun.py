# 기지국 설치

def solution(n, stations, w):
    answer = 0
    std = w*2+1 # 전파 도달 범위
    start = 1
    
    for s in stations:
        # 왼쪽 범위 (s-w-start)
        if s-w-start > 0: # 남아있는 아파트의 범위가 유효하다면
            answer += (s-w-start)//std # 필요한 기지국 최솟값
            if (s-w-start)%std: # 나머지만큼 추가 필요
                answer += 1
        
        # 현재 기지국 오른쪽 범위로 커서 이동
        start = s+w+1 
    
    # 오른쪽 범위 (n-start+1)
    if n-start+1 > 0:
        answer += (n-start+1)//std
        if (n-start+1)%std:
            answer += 1
            
    return answer
