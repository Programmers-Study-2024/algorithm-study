# 섬 연결하기 
# G=(V,E)

def solution(n, costs):
    answer = 0
    costs.sort(key=lambda x:x[2])
    V=set([costs[0][0]])
    
    while len(V) != n :
        for E in costs:
            if E[0] in V and E[1] in V :
                continue
            if E[0] in V or E[1] in V :
                V.add(E[0])
                V.add(E[1])
                answer+=E[2]
                break  
                
    return answer
