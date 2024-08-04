# N개의 최소공배수

def solution(arr):
    # 최소공배수는 arr의 최댓값부터 arr를 모든 곱한 값 사이에 있다.    
    max_answer = 1
    for i in range(len(arr)):
        max_answer *= arr[i]
        
    for i in range(max(arr),max_answer+1):
        # i가 모든 arr 값과 나누어 떨어진다면, 최소공배수이다.
        # 나누어 떨어지지 않으면 바로 다음 i로 넘어가기
        
        flag = True        
        for j in range(len(arr)):
            if i%arr[j] != 0:
                flag = False
                continue
        if flag == True:
            return i
