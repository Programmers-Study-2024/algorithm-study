# 단속카메라

def solution(routes):
    answer = 0
    routes.sort(key=lambda x: x[1]) # routes를 차량이 나간 지점 (진출) 기준으로 정렬
    print(routes)
    camera = -30001 # -30001부터 카메라 위치를 찾습니다.

    for route in routes:
        if camera < route[0]:
            camera = route[1] 
            #print(camera)
            answer += 1 # 카메라 설치
            #print(answer)
    return answer
