# 모음사전

from itertools import product

def solution(word):
    w = ["A","E","I","O","U"]
    dic = []
    for i in range(1,6):
        for j in product(w,repeat=i):
            dic.append(''.join(list(j)))
            
    dic.sort()    
    answer = dic.index(word) + 1
    
    return answer
