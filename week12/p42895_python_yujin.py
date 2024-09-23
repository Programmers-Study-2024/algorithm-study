# N으로 표현

def solution(N, number):
    answer = -1
    
    if N == number:
        return 1
    
    arr = [set() for _ in range(8)]
    
    # 사용가능한 숫자
    for i in range(len(arr)):
        arr[i].add(int(str(N)*(i+1)))
    
    for i in range(1,8):
        for j in range(i):
            for num1 in arr[j]:
                for num2 in arr[i-j-1]:
                    arr[i].add(num1+num2)
                    arr[i].add(num1-num2)
                    arr[i].add(num1*num2)
                    if num2 != 0:
                        arr[i].add(num1//num2)
                
        if number in arr[i]:
            answer=i+1
            break           
                        
    return answer
