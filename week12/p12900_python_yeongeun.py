# 2*n 타일링

def solution(n):
    answer = 0    
    # 1 -> 1
    # 2 -> 2
    # 3 -> 3
    # 4 -> 5
    
    dp = [0]*(n+1)
    dp[1] = 1
    dp[2] = 2
    for i in range(3,n+1):
        dp[i] = (dp[i-2] + dp[i-1])%1000000007

    return dp[i]
