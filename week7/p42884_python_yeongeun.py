# 단속카메라

def solution(routes):
    routes.sort(key = lambda x:x[1]) # 진출시점 기준으로 정렬
    # 진출지점에 대해 정렬해야, 진출지점에 카메라가 있다고 했을 때, 그 다음 진입지점이 진출지점보다 앞서면, 반드시 그 카메라에 단속된다고 장담할 수 있다.
    key = -30001 # 최저 key
    answer = 0
    
    for route in routes:
        if route[0] > key: # 진입시점 > 현위치
            answer += 1 # 카메라 만남
            key = route[1] # 현위치 진출시점으로 업데이트

    return answer
