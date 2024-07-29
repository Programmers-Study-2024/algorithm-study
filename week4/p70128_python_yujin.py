# 내적

def solution(a, b):
    answer = 0
    
    for i in range(0, len(a)) :
        S = a[i]*b[i]
        answer+=S
        
    return answer
