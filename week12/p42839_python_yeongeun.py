# 소수 찾기

from itertools import permutations

def solution(numbers):
    answer = 0
    num = []
    for i in range(1,len(numbers)+1):
        num += (list(permutations(numbers,i)))
        
    new = set(int("".join(n)) for n in num)
    
    for n in new:
        if n < 2:
            continue
        flag = True            
        for i in range(2,int(n**0.5)+1):
            if n % i == 0:
                flag = False
                break
        if flag:
            answer += 1
    
    return answer
