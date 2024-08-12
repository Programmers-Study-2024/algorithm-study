# 괄호 회전하기

# 올바른 괄호 문자열인지 확인
def stack(ss):
    stack = []
    for i in ss:
        if i in ('[','(','{'):
            stack.append(i)
        elif i == ']':
            if '[' not in stack or stack[-1] != '[' : return False
            else: stack.pop()
        elif i == ')':
            if '(' not in stack or stack[-1] != '(' : return False
            else: stack.pop()
        elif i == '}':
            if '{' not in stack or stack[-1] != '{' : return False
            else: stack.pop()


    if stack: return False
    return True

# s를 회전하면서 올바른 문자 괄호열인지 확인
def solution(s):    
    answer = 0
    for i in range(len(s)):
        ss = s[i:] + s[:i]
        if stack(ss) :
            answer += 1
    return answer
