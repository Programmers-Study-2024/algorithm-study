# 섬 연결하기

def solution(n, costs):
    answer = 0
    
    costs.sort(key=lambda x : x[2])
    path=set([costs[0][0]])
    
    while len(path) < n : 
        for a,b,cost in costs :
            if a in path and b in path :
                continue
            if a in path or b in path :
                path.add(a)
                path.add(b)
                answer+=cost
                break
                
    return answer
