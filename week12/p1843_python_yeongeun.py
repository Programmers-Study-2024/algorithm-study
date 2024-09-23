# 사칙연산

def solution(arr):
    # 전체 연산 값이 최대가 되려면, "최대-최소 = 최대"
    minmax = [0, 0] # 각 연산의 최소, 최대 저장
    sum_value = 0 # 지금까지 다 더한 값
    
    for idx in range(len(arr)-1,-1,-1):
        if arr[idx] == "+":
            continue
        elif arr[idx] == "-":
            tempmin, tempmax = minmax
            # 1. 최소 = 가장 큰 전체 값에 (-)가 붙거나, 이전 값에 앞에 (-)가 붙음+최소값
            minmax[0] = min(-(sum_value+tempmax), -sum_value+tempmin)
            # 2. 최대 = 가장 작은 전체 값에 (-)가 붙거나, 바로 뒷값에만 (-)가 붙는 경우
            minus_v = int(arr[idx+1]) # 뺄 뒷값
            minmax[1] = max(-(sum_value+tempmin), -minus_v+(sum_value-minus_v)+tempmax)
            sum_value = 0
            
        elif int(arr[idx]) >= 0:
            sum_value += int(arr[idx])
    
    minmax[1] += sum_value

    return minmax[1]
