# 모의고사

def solution(answers):
    num1 = [1,2,3,4,5]
    num2 = [2,1,2,3,2,4,2,5]
    num3 = [3,3,1,1,2,2,4,4,5,5]

    cnt1, cnt2, cnt3 = 0,0,0
    for i in range(len(answers)):
        if num1[i%len(num1)] == answers[i]:
            cnt1 += 1
        if num2[i%len(num2)] == answers[i]:
            cnt2 += 1
        if num3[i%len(num3)] == answers[i]:
            cnt3 += 1            
    answer = []
    m = max(cnt1,cnt2,cnt3)
    if m == cnt1:
        answer.append(1)
    if m == cnt2:
        answer.append(2)
    if m == cnt3:
        answer.append(3)
    return answer
