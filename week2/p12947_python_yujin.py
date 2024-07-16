#하샤드 수

def solution(x):
    answer = True
    X=0
    for i in str(x) : X+=int(i)
    if(x%X != 0) : answer=False
    return answer
