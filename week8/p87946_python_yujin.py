# 피로도

from itertools import permutations

def solution(k, dungeons):
    # 순열
    permutation_list = list(permutations(dungeons))
    #print(permutation_list)
    answer = 0
    
    for p in permutation_list :
        m = k
        cnt = 0
        for dungeon in p :
            if dungeon[0] <= m :
                m -= dungeon[1]
                cnt+=1
                #print(cnt)
            else : break
        answer= max(answer,cnt)
    return answer
