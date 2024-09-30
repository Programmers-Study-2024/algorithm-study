# 최소직사각형

def solution(sizes):
    a = []
    b = []
    for i in range(len(sizes)):
        # 큰 값을 한쪽으로 몰기
        if sizes[i][0] >= sizes[i][1]:
            a.append(sizes[i][0])
            b.append(sizes[i][1])
        else:
            a.append(sizes[i][1])
            b.append(sizes[i][0])
            
    return max(a)*max(b)
