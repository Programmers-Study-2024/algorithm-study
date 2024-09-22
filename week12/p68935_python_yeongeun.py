# 3진법 뒤집기

def solution(n):
    answer = 0
    a = []
    while n > 0:
        a.append(n%3)
        n = n//3
        
    i = 0
    while len(a) > 0:
        answer += a.pop() * 3 ** (i)
        i += 1

    return answer
