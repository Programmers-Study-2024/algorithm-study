# 피로도

from itertools import permutations

def solution(k, dungeons):
    answer = -1
    for p in permutations(dungeons):
        m=k
        cnt=0
        for dungeon in p :
            if dungeon[0] <= m :
                m-=dungeon[1]
                cnt+=1
            else : 
                break
        answer=max(answer,cnt)
    return answer
