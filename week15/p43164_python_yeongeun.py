# 여행경로

from collections import deque

def solution(tickets):
    answer = []
    
    # 출발지, 출발지에서 갈 수 있는 경로들, 방문한 인덱스 저장
    q = deque()
    q.append(("ICN",["ICN"],[])) # 처음에 ["ICN","ICN"] 있다고 생각
    
    while q:
        airport, path, used = q.popleft()
        if len(used) == len(tickets):
            answer.append(path)
            
        for idx,ticket in enumerate(tickets):
            # 같은 공항이고, 방문하지 않음
            if ticket[0] == airport and not idx in used:
                q.append((ticket[1], path+[ticket[1]], used+[idx]))
        
    answer.sort()
    return answer[0]
