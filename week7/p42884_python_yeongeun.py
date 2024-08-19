# 단속카메라

def solution(routes):
    routes.sort(key = lambda x:x[1]) # 진출시점 기준으로 정렬
    key = -30001 # 최저 key
    answer = 0
    
    for route in routes:
        if route[0] > key: # 진입시점 > 현위치
            answer += 1 # 카메라 만남
            key = route[1] # 현위치 진출시점으로 업데이트

    return answer
