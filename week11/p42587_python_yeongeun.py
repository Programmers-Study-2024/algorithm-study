# 프로세스

def solution(priorities, location):
    answer = 0
    queue = [(idx,p) for idx,p in enumerate(priorities)]
    
    while True:
        front = queue.pop(0)
        
        if any(front[1] < q[1] for q in queue):
            queue.append(front)
        else:
            answer += 1
            if location == front[0]:
                return answer
