# 콜라츠 추측

def solution(num):
    answer = 0
    if num == 1:
        return 0
    else:
        while num != 1:
            answer += 1
            if answer == 500:
                return -1
            elif num%2 == 0:
                num = num//2
            else:
                num = num*3+1
                
    return answer
