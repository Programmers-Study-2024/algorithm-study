# 없는 숫자 더하기

def solution(numbers):
    answer = 45
    #sum(1~9)에서 number 값 삭제
    for i in numbers : answer-=i
    
    return answer
