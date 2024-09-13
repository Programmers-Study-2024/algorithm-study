# 다리를 지나는 트럭

from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0 # 시간
    bridge = deque([0]*bridge_length)
    truck_weights = deque(truck_weights)
    total = 0 # 다리에 있는 트럭무게
    
    while bridge:
        time += 1
        total -= bridge.popleft() # 1초마다 다리에 있는 트럭 하나 제거
        
        if truck_weights:
            # 현재 다리에 있는 무게 + 들어갈 트럭의 무게 <= 최대 제한 무게
            if total + truck_weights[0] <= weight:
                # 트럭 입장
                total += truck_weights[0]
                bridge.append(truck_weights.popleft())
            else:
                bridge.append(0)
                
    return time
