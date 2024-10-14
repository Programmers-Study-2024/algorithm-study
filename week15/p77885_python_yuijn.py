# 2개 이하로 다른 비트

def solution(numbers):
    answer = []

    for n in numbers:
        # 짝수일 경우
        if n % 2 == 0:  
            answer.append(n + 1)
        # 홀수 인 경우
        else:  
            temp = '0' + format(n,'b')
            idx = temp.rfind('0')
            temp = list(temp)
            temp[idx], temp[idx+1] = '1', '0'
            
            answer.append(int("".join(temp),2))
                
    return answer
