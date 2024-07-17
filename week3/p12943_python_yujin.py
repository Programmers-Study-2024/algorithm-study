# 콜라츠 추측

def solution(num):
    answer = 0
    i=0
    
    while(i<500) :
        if(num==1) : break
        elif(num%2==0) : num=num/2
        else : num=num*3+1
        i+=1
    
    
    if(i<500) : answer=i 
    else : answer=-1
    
    return answer
