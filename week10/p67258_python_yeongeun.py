# 보석 쇼핑

def solution(gems):
    n = len(gems)
    answer = [0,n-1]        
    kind = len(set(gems)) # 보석종류
    dic = {gems[0]:1,} # 길이별 보석종류 체크
    s = e = 0
    
    while s<n and e<n:
        if len(dic) < kind: # 종류 부족           
            e += 1 # 한 개 추가
            if e == n:
                break
            dic[gems[e]] = dic.get(gems[e],0) + 1 # e위치 보석개수 증가
        
        else:
            if (e-s+1) < (answer[1]-answer[0]+1): # 조건만족시 update
                answer = [s,e]
            # s위치 보석 제거
            if dic[gems[s]] == 1: 
                del dic[gems[s]]
            else:
                dic[gems[s]] -= 1
            # e는 동일한 상태로, s만 한 칸 앞으로
            s += 1
                
    answer[0] += 1
    answer[1] += 1
    return answer
