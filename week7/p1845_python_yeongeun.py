# 폰켓몬

def solution(nums):
    count = {}
    for n in nums: # 겹치는 포켓몬 몇개인지는 중요하지 않음
        count[n] = 1

    # n//2마리 포켓몬 다 다르게 고르거나, 겹치면 안겹치게 고르기
    return min(len(count),len(nums)//2)
