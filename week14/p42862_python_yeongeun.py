# 체육복

def solution(n, lost, reserve):
    # 여벌이 있는 학생도 체육복을 도난당했을 수도 있다. 
    # => 본인이 사용해야 하기 때문에, 다른 학생에게 체육복 빌려줄 수 없다.
    set_reserve = set(reserve) - set(lost)
    set_lost = set(lost) - set(reserve)
    
    for r in set_reserve:
        # 양쪽 학생이 모두 빌려줄 수 있다면, 왼쪽 학생에게 먼저 부여
        if r-1 in set_lost:
            set_lost.remove(r-1)
        # 왼쪽 학생이 없을 경우, 오른쪽 학생이 빌려줄 수 있는 지 확인
        elif r+1 in set_lost:
            set_lost.remove(r+1)
    
    return n-len(set_lost)
