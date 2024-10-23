# 완주하지 못한 선수

def solution(participant, completion):
    answer = ''
    dic={}
    
    for i in participant :
        if i in dic:
            dic[i]+=1
        else :
            dic[i]=1
            
    for i in completion :
        dic[i]-=1
        
    for i in dic :
        if dic[i]==1: 
            return i
