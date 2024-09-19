# 기능개발

def solution(progresses, speeds):
    answer = []
    stack = []
    for i in range(len(progresses)):
        day = (100 - progresses[i])/speeds[i]
        if day != int(day):
            day = int(day) + 1
        
        if stack:
            if stack[-1] >= day:
                cnt += 1
            else:
                stack.pop()
                answer.append(cnt)
                stack.append(day)
                cnt = 1
        else:
            stack.append(day)
            cnt = 1
            
    answer.append(cnt)
    return answer
