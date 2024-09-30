# 소수 찾기

from itertools import permutations

def check(n):
    if n<2 :
        return False
    for i in range(2,int(n**0.5)+1):
        if n % i == 0 :
            return False
        
    return True

def solution(numbers):
    answer = set()
    
    for i in range(1, len(numbers)+1) :
        number=set(map(int,map("".join, permutations(numbers, i))))
        print(number)
        for j in number :
            if check(j) :
                answer.add(j)
                
    return len(answer)
