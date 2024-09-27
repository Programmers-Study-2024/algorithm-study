# 피로도

from itertools import permutations

def solution(k, dungeons):
    
    # 던전 탐험하는 모든 경우의 수
    dun = list(permutations(dungeons,len(dungeons)))
    answer = [0]*len(dun)
    
    for i in range(len(dun)):
        a = k
        for j in range(len(dun[i])):
            if a >= dun[i][j][0]: # 현재피로도 >= 최소피로도
                a -= dun[i][j][1] # 소모피로도
                answer[i] += 1
            else:
                continue

    return max(answer)
