# 구명보트

from collections import deque
def solution(people, limit):
    dq = deque(sorted(people,reverse=True)) # 내림차순 정렬
    answer = 0 # 최소한의 보트수
    
    while len(dq) > 1:
        if dq[0] + dq[-1] <= limit: # 가장 큰 값 + 가장 작은 값 조합
            answer += 1 # 같이 보트 태우고 pop
            dq.pop()
            dq.popleft()
        else: # 가장 큰 값만 보트태우고 pop
            answer += 1
            dq.popleft()
    if dq: # 한 명 못탔으면 혼자 태우기
        answer += 1

    return answer
