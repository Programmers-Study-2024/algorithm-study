# 기능개발

def solution(progresses, speeds):
    answer = []
    cnt=0 # 나갈 개수
    day=1 # 누적 작업 날짜
    while len(progresses) > 0 :
        if(progresses[0]+day*speeds[0] >= 100) :
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1
        else :
            if cnt > 0:
                answer.append(cnt)
                cnt = 0
            else:
                day+=1
    answer.append(cnt)
    return answer
