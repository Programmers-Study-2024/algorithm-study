# 소수 만들기

from itertools import combinations

def solution(nums):
    
    sum_stack = []    
    lst = list(combinations(nums,3))
    for l in lst:
        num = int(l[0])+int(l[1])+int(l[2])
        cnt = 0
        for i in range(1,int(num**(1/2))+1):      
            if num%i == 0 and i != num and i != 1:
                cnt += 1
        if cnt == 0:
            sum_stack.append(num)    

    return len(sum_stack)
