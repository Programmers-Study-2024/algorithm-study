# 기능개발

def solution(progresses, speeds):
    answer = []
    stack = []
    for i in range(len(progresses)):
        # 작업시간 계산
        day = (100-progresses[i])/speeds[i]
        if int(day) != day:
            day = int(day)+1
        
        # stack의 마지막 값(가장 큰 값)과 비교하면서 조건 설정
        if stack:
            if stack[-1] >= day: # 큰값 끝날때까지 기다려야함
                cnt += 1
            else:
                stack.pop()
                stack.append(day)
                answer.append(cnt)
                cnt = 1
        else:
            stack.append(day)
            cnt = 1
            
    answer.append(cnt) # 마지막 개수 추가필요
    return answer
