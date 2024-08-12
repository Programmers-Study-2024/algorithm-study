# 등굣길(O)

def solution(m, n, puddles):
    answer = 0
    dp = [[0] * (m+1) for _ in range(n+1)] # 격자
    puddles = [[q,p] for [p,q] in puddles] # 리스트 순서상 dp[세로][가로]이기 때문에 위치 바꿔주기
    dp[1][1] = 1

    for i in range(1,n+1): # 세로
        for j in range(1,m+1): # 가로
            if [i,j] == [1,1]: # 시작지점
                continue
            if [i,j] in puddles: # 웅덩이 만나면 0으로 초기화
                dp[i][j] = 0
            else: # 오른쪽과 아래쪽으로만 움직임
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000007

    return dp[n][m]
