# 자연수 뒤집어 배열로 만들기

def solution(n):
    answer = []

    for i in str(n) : 
        answer.append(int(i))

    answer.reverse()
    return answer
