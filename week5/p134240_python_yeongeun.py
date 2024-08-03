# 푸드 파이트 대회

def solution(food):
    num = ''    
    for i in range(1,len(food)):
        num += str(i) * int(food[i]//2)
    answer = num + "0" + num[::-1]

    return answer
