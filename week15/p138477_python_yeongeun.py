# 명예의 전당(1)

def solution(k, score):
    answer = []
    stack = [] #명예의 전당 리스트
    
    for s in score:
        stack.append(s)
        if len(stack) > k:            
            stack.pop(stack.index(min(stack)))
        answer.append(min(stack))
        
    return answer
