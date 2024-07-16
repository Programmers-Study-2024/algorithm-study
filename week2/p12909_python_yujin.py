#올바른 괄호

def solution(s):
    answer = True
    stack=[]
  
    for i in s : 
      # '(' 삽입
        if(i=='(') : stack.append(i)
      # ')' 일때,
        else : 
          # list가 비어있으면 false
            if(stack==[]) : answer=False
          # 그 외  '(' 삭제
            else : stack.pop()

  # 끝나고도 list가 비어있지않으면 false
    if(stack!=[]) : answer=False
    
    return answer
