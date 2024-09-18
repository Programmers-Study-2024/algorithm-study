# 3진법 뒤집기

def solution(n):
    answer = 0
    n3=''
    while n>0 :
        n3=str(n%3)+n3
        n=n//3
    
    for i in range(len(n3)) :
        answer+=(3**i)*int(n3[i])
        
    return answer
