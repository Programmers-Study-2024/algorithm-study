# 문자열 내 p와 y의 개수

def solution(s):
    answer = True
    cnt = 0

    for i in s:
        if(i=='p' or i=='P') : cnt+=1
        elif (i=='y'or i=='Y') : cnt-=1

    if(cnt != 0 ) : answer = False

    return answer
