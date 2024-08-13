# 괄호 회전하기

def CHECK(s) : 
    stack=[]
    
    for i in s : 
      # '(' 삽입
        if(i in ['(','[','{']) : stack.append(i)
      # ')' 일때,
        else : 
          # list가 비어있으면 false
            if not stack : return False
            elif i==')' and stack.pop() != '(' : return False
            elif i==']' and stack.pop() != '[' : return False
            elif i=='}' and stack.pop() != '{' : return False
    if not stack : return True

def solution(s):
    answer = 0
    
    for i in range (len(s)):
        #리스트를 순환
        r=s[i:]+s[:i]
        if(CHECK(r)) : answer+=1
    
    return answer
