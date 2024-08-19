# n^2 배열 자르기

# 1차 시도(시간초과)
def solution(n, left, right):
    answer = [[0]*n for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            answer[i][j] = max(i,j)+1
            
    arr = sum(answer,[])
    return arr[left:right+1]

# 2차 시도(성공)
def solution(n, left, right):
    answer = []
    # 인덱스 0 1 2 3 4 5 6 7 8
    # /n    0 1 2 1 1 2 2 2 2
    # 인덱스를 n으로 나눈 몫, 나머지 중 큰 값
    
    for i in range(left,right+1):
        a = i//n
        b = i%n
        if a<b: a,b = b,a
        answer.append(a+1)
    return answer
