# 문자열 내림차순으로 배치하기

def solution(s):
    S=list(s)
    S.sort(reverse=True)
    return "".join(S)
