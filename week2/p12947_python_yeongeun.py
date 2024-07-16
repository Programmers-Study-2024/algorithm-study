# 하샤드 수

def solution(x):
    
    list_a = list(str(x))
    a = sum(list(map(int,list_a)))
    if x%a == 0:
        answer = True
    else:
        answer = False
    
    return answer
