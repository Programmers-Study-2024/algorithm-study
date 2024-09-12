# 섬 연결하기

def solution(n, costs):
    answer = 0    
    bridge = set([costs[0][0]])
    costs.sort(key=lambda x:x[2])
    
    # 비용 낮은 다리부터 연결
    while len(bridge) != n:
        for x,y,c in costs:
            # x 연결되어있고, y 아직 방문 안했고
            if x in bridge and y not in bridge:
                answer += c
                bridge.add(y)
                break
            # y 연결되어있고, x 아직 방문 안했고
            elif y in bridge and x not in bridge:
                answer += c
                bridge.add(y)
                break           
#        print(bridge)
#        print(answer)
    return answer
