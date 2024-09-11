# 모음사전

from itertools import product

def solution(word):
    words = []
    for i in range(1,6):
        # 모든 경우의 수 저장
        # 1번~6번 반복
        for j in product(['A','E','I','O','U'],repeat=i):
            words.append(''.join(list(j)))
    # 정렬
    words.sort()
    # index 찾기
    answer = words.index(word) + 1
    
    return answer
