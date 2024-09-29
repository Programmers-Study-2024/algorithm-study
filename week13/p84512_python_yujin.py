# 모음사전

from itertools import product

def solution(word):
    words=[]
    
    for i in range(1,6):
        for j in product("AEIOU",repeat=i):
            words.append(''.join(list(j)))
    
    words.sort()
    return words.index(word)+1
