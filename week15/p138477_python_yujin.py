# 명예의 전당 (1)

def solution(k, score):
    answer = []
    R3=[]
    for i in score:
        if len(R3)<k:
            R3.append(i)
        else:
            if min(R3)<i:
                R3.remove(min(R3))
                R3.append(i)
        answer.append(min(R3))
    return answer
