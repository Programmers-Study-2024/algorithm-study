# 등굣길

def solution(m, n, puddles):
    answer = 0
    dp = [[0 for _ in range(m+1)] for _ in range(n+1)] # dp[세로,가로]
    puddle = [[j,i] for [i,j] in puddles] # [가로,세로]이므로 dp기준으로 바꿔주기
    
    # 인덱스 맞춰주기위해 전체 크기 (n+1) * (m+1). 0행 0열은 기본값 0으로 되어있음  
    for i in range(1,n+1): # 세로
        for j in range(1,m+1): # 가로
            if [i,j] == [1,1]:
                dp[i][j] = 1
                continue
            elif [i,j] not in puddle: # 웅덩이X
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000007
#    print(dp)
    
    return dp[n][m]
