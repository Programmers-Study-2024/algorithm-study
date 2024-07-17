# 나머지가 1이 되는 수 찾기

def solution(n):
    
    for answer in range(1,n) : 
        if(n%answer==1) : return answer
