# 땅따먹기

def solution(land):
    for i in range(1,len(land)):
        for j in range(len(land[0])) :
            # 다음 행 + max(같은 열 제외 list)
            land[i][j] += max(land[i-1][:j] + land[i-1][j+1:])
    # max(마지막 줄 land 값)  
    return max(land[len(land)-1])
