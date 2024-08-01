# 짝지어 제거하기

def solution(s):
    stack = []
    for i in s:
        if len(stack) == 0: # stack이 비어있다면 추가
            stack.append(i)
        elif stack[-1] == i: # stack 안에 있는 마지막 원소가 i와 같다면 해당 원소 제거
            stack.pop()
        else:
            stack.append(i)
            
    if len(stack) == 0: # 모두 짝지어 제거된 경우
        return 1
    else:
        return 0
