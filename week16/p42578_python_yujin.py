# 의상

def solution(clothes):
    answer = 1
    
    dic={}
    
    for c in clothes :
        if c[1] in dic : 
            dic[c[1]]+=1
        else :
            dic[c[1]]=1
            
    for k,v in dic.items() :
        answer*=(v+1)
        
    return answer-1
