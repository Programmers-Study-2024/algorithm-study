# 등굣길

def solution(m, n, puddles):
    dp = [[0] * (m + 1) for i in range(n + 1)] # dp 테이블 초기화
    dp[1][1] = 1
        
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if i==1 and j==1: continue # 시작점
            if [j,i] in puddles: dp[i][j] = 0 # 열,행 -> 행,열 / 웅덩이는 누적 X => 0
            else:
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007
            
    return(dp[n][m])