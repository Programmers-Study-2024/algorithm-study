# 소수 만들기

from itertools import combinations

def solution(nums):
    answer = 0
    
    for i in combinations(nums,3):
        num=sum(i)
        
        for j in range (2,num):
            if num%(j)==0 : 
                break
                
        else : answer+=1
        
    return answer
