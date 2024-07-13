# 자릿수 더하기

def solution(n):
    answer = 0
    for i in range(9,-1,-1):        
        answer += n//(10**i)
        n -= (n//(10**i))*(10**i)
    
    return answer
