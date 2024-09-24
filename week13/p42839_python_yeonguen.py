# 소수 찾기

from itertools import permutations

def solution(numbers):
    answer = 0
    num = []
    for i in range(1,len(numbers)+1):
        num += list(permutations(numbers,i))
    
    num = set(int("".join(n)) for n in num)
    
    for a in num:
        if a > 1:
            flag = True
            for j in range(2,int(a**(0.5))+1):
                if int(a)%j == 0:
                    flag = False
                    break
            if flag:
                answer += 1
                
    return answer
