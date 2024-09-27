# 카펫

def solution(brown, yellow):
    total = brown + yellow
    # total ** 0.5
    for i in range(3,total//2+1):
        if total%i == 0:
            if i*2 + (2 * max((total//i-2),1)) == brown:
                return [total//i,i]
