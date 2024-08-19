# H-index

def solution(citations):
    # h편의 논문이 h회 이상 인용
    c = sorted(citations)
    for i in range(len(c)):
        if c[i] >= len(c)-i:
            return len(c)-i    

    return 0
