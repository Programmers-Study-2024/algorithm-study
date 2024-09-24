# 섬 연결하기

# 크루스칼 알고리즘
def solution(n, costs):
    answer = 0
    bridge = set([costs[0][0]])
    costs.sort(key = lambda x:x[2])
    
    while len(bridge) != n:
        for x,y,c in costs:
            if x in bridge and y not in bridge:
                answer += c
                bridge.add(y)
                break
            elif x not in bridge and y in bridge:
                answer += c
                bridge.add(x)
                break

    return answer
