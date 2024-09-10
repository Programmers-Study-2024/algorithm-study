# 롤케이크 자르기

from collections import Counter 

def solution(topping):
    answer = 0
    A = Counter(topping)  
    B = set() 
        
    for i in topping:
        A[i] -= 1
        B.add(i) 
        
        #print(A,B)
        # 토핑이 0일 때,
        if A[i] == 0:
            A.pop(i) 
        if len(A) == len(B): 
            answer += 1 
            
    return answer
