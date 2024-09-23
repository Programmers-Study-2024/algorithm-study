# 도둑질

def solution(money):
    # DP = 집 털 수 있을 때마다 돈 더하면서 업데이트
    
    # 원 일때는 크게 두가지 경우
    # 1. 첫번째 집 터는 경우 
    # = 항상 마지막 집 못 턴다 [-2] 가장 큰 값
    dp1 = [0 for _ in range(len(money))]
    dp1[0] = money[0]
    for i in range(1,len(money)): # 직전 값 털기 or 현재 값 + 한칸 전값 털기
        dp1[i] += max(dp1[i-1], money[i] + dp1[i-2])
    
    # 2. 두번째 집 터는 경우
    # = 항상 마지막 집 털 수 있다. [-1] 가장 큰 값
    dp2 = [0 for _ in range(len(money))]
    dp2[0] = 0
    for j in range(1,len(money)):
        dp2[j] = max(dp2[j-1], money[j] + dp2[j-2])    

    return max(dp1[-2], dp2[-1])
