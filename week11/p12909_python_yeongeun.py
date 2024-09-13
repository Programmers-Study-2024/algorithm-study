# 올바른 괄호

def solution(s):
    stack = []
    
    for i in s:
        if i == "(":
            stack.append(i)
        elif i == ")" and "(" not in stack:
            return False
        elif i == ")" and "(" in stack:
            stack.pop()
    if stack:
        return False
    else:
        return True
