# 뒤에 있는 큰 수 찾기

def solution(numbers):
    stack = [] # 인덱스 저장
    answer = [-1]*len(numbers)
    
    for i in range(len(numbers)):
        # 해당 인덱스와 numbers 값들 비교
        while stack and numbers[stack[-1]] < numbers[i]:
            answer[stack.pop()] = numbers[i]
        stack.append(i)

    return answer
