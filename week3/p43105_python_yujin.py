# 정수 삼각형

def solution(triangle):
    # 깊이
    for i in range(1, len(triangle)):
        # 원소
        for j in range(i+1):
            # 맨 앞
            if (j==0):
                triangle[i][j] += triangle[i-1][j]
            # 맨 뒤
            elif (j==i):
                triangle[i][j] += triangle[i-1][j-1]
            # 중간 (max로 선택 누적)
            else:
                triangle[i][j] += max(triangle[i-1][j], triangle[i-1][j-1])
                
    return max(triangle[len(triangle)-1])
