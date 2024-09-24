# 모의고사

def solution(answers):
    
    num1 = [1,2,3,4,5]
    num2 = [2,1,2,3,2,4,2,5]
    num3 = [3,3,1,1,2,2,4,4,5,5]
    
    a,b,c = 0,0,0
    for i in range(len(answers)):
        if answers[i] == num1[i%len(num1)]:
            a += 1
        if answers[i] == num2[i%len(num2)]:
            b += 1
        if answers[i] == num3[i%len(num3)]:
            c += 1

    answer = []
    m = max(a,b,c)
    if a == m:
        answer.append(1)
    if b == m:
        answer.append(2)
    if c == m:
        answer.append(3)

    return answer
