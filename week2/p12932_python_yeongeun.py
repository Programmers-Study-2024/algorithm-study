# 자연수 뒤집어 배열로 만들기

def solution(n):
    list_str = list(str(n)[::-1])
    answer = list(map(int,list_str))
    return answer
