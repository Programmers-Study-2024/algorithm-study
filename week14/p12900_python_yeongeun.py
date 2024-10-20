# 2*n 타일링

def solution(n):
    # 1 -> 1
    # 2 -> 2
    # 3 -> 3
    # 4 -> 5
    
    dp = [1] * (n)
    dp[1] = 2
    for i in range(2,n):
        dp[i] = (dp[i-1] + dp[i-2])%1000000007

    return dp[-1]
