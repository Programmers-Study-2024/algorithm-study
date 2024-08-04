# 카펫

def solution(brown, yellow):
    total = brown + yellow
    
    for b in range(1,total+1):
        if (total/b) % 1 == 0: # 우선 나누어 떨어져야 함. total의 약수
            a = total / b
            if a >= b: # 항상 가로 >= 세로
                if 2*a + 2*b -4 == brown: # 테두리 brown = 가로*2+ 세로*2 - 겹치는 모서리 4
                    return [a,b]
