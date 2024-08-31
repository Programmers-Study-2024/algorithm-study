# 불량 사용자

from itertools import permutations

def solution(user_id, banned_id):
    answer = []
    
    for b in permutations(user_id,len(banned_id)) :
        if match(b,banned_id):
            b=set(b)
            if b not in answer :
                answer.append(b)
    
    #print(answer)
    return len(answer)

def match(b,banned_id):
    for i in range(len(b)) :
        if len(b[i])==len(banned_id[i]):
            for j in range(len(b[i])) :
                if b[i][j] != banned_id[i][j] :
                    if banned_id[i][j] == '*':
                        continue
                    else : 
                        return False
        else : 
            return False 
    return True
