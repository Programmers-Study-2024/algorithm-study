# 사칙연산

def solution(arr):
    INF = 987654321
    n = len(arr)//2+1
    MIN_DP = [[INF for _ in range(n)] for _ in range(n)]
    MAX_DP = [[-INF for _ in range(n)] for _ in range(n)]
    

    #print(MIN_DP)
    #print(MAX_DP)
    
    for step in range(len(MAX_DP)): #i와 j의 간격.
        for i in range(len(MAX_DP)-step): #i부터 j까지의 연산을 수행함.
            j = i + step
            
            if step == 0:
                MIN_DP[i][i]=int(arr[i*2])
                MAX_DP[i][i]=int(arr[i*2])
                continue
                
            for k in range(i, j): #(i ~ j) 안에 k번째 연산 마지막.
                #print(i,j,k,step)
                if arr[k*2+1] == '+': 
                    MAX_DP[i][j] = max(MAX_DP[i][j], MAX_DP[i][k] + MAX_DP[k+1][j]) # MAX = MAX + MAX.
                    MIN_DP[i][j] = min(MIN_DP[i][j], MIN_DP[i][k] + MIN_DP[k+1][j]) # MIN = MIN + MIN.
                else: 
                    MAX_DP[i][j] = max(MAX_DP[i][j], MAX_DP[i][k] - MIN_DP[k+1][j]) # MAX = MAX - MIN.
                    MIN_DP[i][j] = min(MIN_DP[i][j], MIN_DP[i][k] - MAX_DP[k+1][j]) # MIN = MIN - MAX.
                #print(MAX_DP)
                #print(MIN_DP)
    
    
    return MAX_DP[0][-1] # 끝까지 계산
