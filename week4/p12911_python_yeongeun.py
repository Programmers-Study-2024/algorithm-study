# 다음 큰 숫자

def solution(n):
    answer = n
    c = format(n,'b').count('1')
    while True:
        answer += 1
        if format(answer,'b').count('1') == c:
            return answer
