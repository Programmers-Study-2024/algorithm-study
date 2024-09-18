# 올바른 괄호

def solution(s):
    answer = True
    stack=[]
    
    for i in s :
        if(i=='('):
            stack.append(i)
        else :
            if(stack==[]) : answer=False
            else : stack.pop()
            
    if(stack!=[]) : answer=False
    return answer
