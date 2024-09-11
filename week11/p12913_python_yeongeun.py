# 땅따먹기

def solution(land):

    for i in range(1,len(land)): # i행
        for j in range(len(land[0])): #j열
            # j열 제외하고 가장 큰 값을 더해주기
            land[i][j] += max(land[i-1][:j] + land[i-1][j+1:])

    return max(land[-1])
