# 뒤에 있는 큰 수 찾기

def solution(numbers):
    answer = [-1] * len(numbers)
    stack =[]
    
    for i in range(len(numbers)):
            while stack and numbers[stack[-1]] < numbers[i]:
                #print(numbers[stack[-1]],'<',numbers[i])
                answer[stack.pop()] = numbers[i]
                #print(answer)
            stack.append(i)
            #print(stack)
    
    return answer
