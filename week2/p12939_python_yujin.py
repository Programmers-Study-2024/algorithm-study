# 최댓값과 최솟값

def solution(s):
    S = list(map(int,s.split(' ')))
    
    return str(min(S))+" "+str(max(S)) 
