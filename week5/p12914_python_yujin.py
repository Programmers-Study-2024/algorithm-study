# 멀리 뛰기

def solution(n):
    a,b = 1,1
    for i in range(n):
        a,b = b,a+b
    return a%1234567
