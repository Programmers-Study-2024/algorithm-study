# 피로도

from itertools import permutations

def solution(k, dungeons):
    answer = -1
    dun_p = permutations(dungeons,len(dungeons))
    for dun in dun_p:
        result = 0
        m = k
        for d in dun:            
            if m >= d[0]:
                m -= d[1]
                result += 1
        answer = max(answer,result)
    return answer
