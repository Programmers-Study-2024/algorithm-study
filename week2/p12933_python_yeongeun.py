# 정수 내림차순으로 배치하기

def solution(n):
    list_a = sorted(str(n))[::-1]
    answer = int(''.join(list_a))
    return answer
