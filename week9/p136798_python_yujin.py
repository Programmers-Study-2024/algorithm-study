# 기사단원의 무기

def solution(number, limit, power):
    answer = 0
    NUM=[]
    
    for i in range (1,number+1) : 
        cnt=0
        for j in range (1,int(i**(1/2)) + 1) :
            if (i%j==0) : 
                cnt+=1
                if j**2 != i: 
                    cnt+= 1
        NUM.append(cnt)
    
    for i in NUM :
        if(i > limit) :
            i=power
        answer+=i
    
    return answer
