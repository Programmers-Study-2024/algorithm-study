# 올바른 괄호

def solution(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append(i)
        elif i == ')':
            if '(' in stack:
                stack.pop()
            else:
                return False
    
    if stack:
        return False
    else:
        return True
