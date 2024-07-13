#두 정수 사이의 합

def solution(a, b):
    answer = 0
    if a< b:
        answer = sum(range(a,b+1))
    else :
        answer = sum(range(b,a+1))
    return answer
