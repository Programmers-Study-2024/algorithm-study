# 구명보트

from collections import deque
def solution(people, limit):
    dq = deque(sorted(people,reverse=True))
    print(dq)
    answer = 0
    
    while len(dq) > 1:
        if dq[0] + dq[-1] <= limit:
            answer += 1
            dq.pop()
            dq.popleft()
        else:
            answer += 1
            dq.popleft()
    if dq:
        answer += 1

    return answer
