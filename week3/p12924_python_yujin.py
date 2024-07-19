# 숫자의 표현

def solution(n):
    answer = 0
    
    for i in range(1,n+1) :
        sum=0
        num=i
        while(sum<n) : 
            sum += num
            num +=1
        if(sum==n) : answer+=1
    return answer
