# JadenCase 문자열 만들기

def solution(s):
    answer = []
    case = s.split(' ')
    for c in case:
        if c:
            answer.append(c[0].upper() + c[1:].lower())
        else:
            answer.append(c)
    return " ".join(answer)
