# 택배상자

def solution(order):
    answer = 0
    belt = []
    idx = 0 # order 기준 인덱스 0~len(order)
    
    for i in range(1,len(order)+1):
        belt.append(i) # 현재 상자 컨테이너벨트에 넣기
        
        # 벨트가 있고 원하는 상자 꺼낼 수 있다면,
        while belt and belt[-1] == order[idx]:
            answer += 1
            idx += 1
            belt.pop()

    return answer
