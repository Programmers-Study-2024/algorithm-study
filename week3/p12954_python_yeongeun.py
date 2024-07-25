# x만큼 간격이 있는 n개의 숫자

def solution(x, n):
    answer = []
    if x == 0:
        answer = [0]*n
    elif x > 0:
        answer = [i for i in range(x,x*n+1,x)]
    else:
        answer = [i for i in range(x,x*n-1,x)]
        
    return answer
