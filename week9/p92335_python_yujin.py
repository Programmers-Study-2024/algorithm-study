# k진수에서 소수 개수 구하기

import math

def solution(n, k):
    answer = 0
    num=''
    while n>0 :
        n,r = divmod(n,k) 
        num=str(r)+num
        
    num= num.split('0')
    
    for i in num :
        if len(i)==0 or int(i)<2 :
            continue
        for j in range (2,int(math.sqrt(int(i))) + 1) :
            if int(i)%j==0 :
                break
        else :
            answer+=1
        
    return answer
