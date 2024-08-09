# 귤 고르기

def solution(k, tangerine):
    answer = 0
    
    # 귤 종류별 개수 세주기
    count = {}
    for t in tangerine:
        try: count[t] += 1
        except : count[t] = 1
        
    # 귤 종류 많은 것 순으로 정렬
    a = dict(sorted(count.items(),key=lambda x:x[1], reverse=True))
    for i in a:
        if k <= 0:
            return answer
        k -= a[i] # 귤 개수 value 빼주기
        answer += 1 # 귤 종류 += 1
    return answer
