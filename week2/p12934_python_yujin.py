# 정수 제곱근 판별

import math

def solution(n):
    answer = 0

    N=math.sqrt(n)
    if(N%1==0) : answer=(N+1)**2
    else : answer =-1

    return answer
