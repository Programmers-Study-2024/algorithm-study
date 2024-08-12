# 숫자 게임(X)

def solution(A, B):
    answer = 0
    
    A.sort(reverse=True)
    B.sort(reverse=True)
    
    size = len(A)
    ai = 0
    bi = 0
    
    # A 기준으로 돌린다
    while size != 0:
        # A 최대값 < B 최대값 => B이김. B 위치 += 1
        if A[ai] < B[bi]:
            answer += 1
            bi += 1
        ai += 1
        size -= 1
      
    return answer
