# 정수 삼각형

def solution(triangle):
    
    for i in range(len(triangle)):
        for j in range(len(triangle[i])):
            if i == 0: # 첫줄은 무시
                continue
            elif j == 0: # 왼쪽 값 없으면
                triangle[i][j] += triangle[i-1][j]
            elif j == len(triangle[i])-1: # 오른 쪽 값 없으면
                triangle[i][j] += triangle[i-1][j-1]
            else: # 왼쪽, 오른쪽 값 중 큰 값이랑 더해주기
                triangle[i][j] += max(triangle[i-1][j-1], triangle[i-1][j])
                
    return max(triangle[-1])
