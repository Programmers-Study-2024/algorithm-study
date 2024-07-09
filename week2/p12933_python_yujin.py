# 정수 내림차순으로 배치하기

def solution(n):
    answer=list((str(n)))
    answer.sort(reverse=True)

    # 파이썬 리스트 -> 문자열 : join
    return int("".join(answer))
