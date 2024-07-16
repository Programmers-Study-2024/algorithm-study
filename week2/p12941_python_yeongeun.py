# 최솟값 만들기

def solution(A,B):
    answer = 0
    
    A = sorted(A)
    B = sorted(B)[::-1]
    
    for i in range(len(A)):
        answer += A[i]*B[i]
    
    return answer
