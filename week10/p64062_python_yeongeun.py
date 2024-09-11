# 징검다리 건너기

def solution(stones, k):
    # 정답 범위
    start, end = 1, max(stones)
    
    while start <= end:
        cnt = 0 # 연속으로 못건너는 돌 개수
        mid = (start+end)//2
        
        for stone in stones:
            if (stone-mid) <= 0:
                cnt += 1
            else:
                cnt = 0
            if cnt >= k: # 조건충족못하면 mid명 못건넘
                break
                
        if cnt >= k: # k개 넘어가면, 너무 사람 수가 많은 것
            end = mid-1 # 범위 줄이기 start ~ mid-1
        else:
            start = mid+1
                
    return start
