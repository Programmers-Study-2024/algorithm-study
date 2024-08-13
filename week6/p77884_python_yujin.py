# 약수의 개수와 덧셈

def solution(left, right):
    answer = 0
    
    for num in range(left, right+1) :
        count=0
        for j in range(1,num+1) : 
            if(num%j==0) : count+=1
            
        if(count%2==0) : answer+=num
        else : answer-=num
    return answer
