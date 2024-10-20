# 여행경로

def solution(tickets):
    answer = []
    dic={}
    
    for a,b in tickets :
        if a not in dic:
            dic[a]=[b]
        else :
            dic[a].append(b)
        dic[a].sort(reverse=True)
        
    stack=["ICN"]
    
    while stack :
        tmp=stack[-1]
        if tmp not in dic or len(dic[tmp]) == 0:
            answer.append(stack.pop())
        else :
            stack.append(dic[tmp].pop())
        
    return answer[::-1]
