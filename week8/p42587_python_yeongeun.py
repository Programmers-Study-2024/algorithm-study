# 프로세스

def solution(priorities, location):
    
    queue = [(i,p) for i,p in enumerate(priorities)]
    answer = 0
    
    while True:
        front = queue.pop(0)
        if any(front[1] < q[1] for q in queue):
            queue.append(front)
        else:
            answer += 1
            if front[0] == location:
                return answer
