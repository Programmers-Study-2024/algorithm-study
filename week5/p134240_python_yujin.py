# 푸드 파이트 대회

def solution(food):
    answer = '' # 왼쪽 
    
    for i in range(1, len(food)):
        answer += str(i) * (food[i]//2)
    return answer + '0' + answer[::-1]
