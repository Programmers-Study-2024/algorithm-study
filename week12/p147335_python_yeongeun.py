# 크기가 작은 부분문자열

def solution(t, p):
    answer = 0
    for i in range(len(t)):
        a = t[i:i+len(p)]
        if len(a) == len(p):
            if int(a) <= int(p):
                answer += 1
        else:
            break

    return answer
