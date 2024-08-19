# 의상

def solution(clothes):
    # 1. 옷을 종류별로 구분하기
    hash_map = {}
    for clothe, type in clothes:
        hash_map[type] = hash_map.get(type, 0) + 1
        # 같은 종류의 옷이 있다면, type(같은 종류의 개수) + 1
        # 같은 종류의 옷이 없다면, 0 + 1
        
    # 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
    # (안입기/모자1/모자2 * 안입기/안경1)
    answer = 1
    for type in hash_map:
        answer *= (hash_map[type] + 1)
        # (옷종류1+1) * (옷종류2+1) ....
    
    # 3. 아무종류의 옷도 입지 않는 경우 제외하기
    return answer - 1
