# 스티커 모으기(2)

# 계속 최적의 값으로 업데이트 하는 DP 문제
def solution(sticker):
    answer = 0
    
    # 0. 예외) 값 1개 밖에 없는 경우 처리
    if len(sticker) == 1:
        return sticker.pop()
    
    # 원형DP - 2가지 경우
    size = len(sticker)
    
    # 1. 첫번째 값 선택 (마지막값 사용X)
    # 인덱스 오류 방지 : 앞에 임시로 0 넣어주기
    dp1 = [0] + sticker[:-1]
    for i in range(2,size):
        # 최적의 값으로 해당 값 업데이트
        # max(1칸전까지의 최대값, 2칸전까지의 최대값+현재값)
        dp1[i] = max(dp1[i-1],dp1[i-2]+dp1[i])
        
    # 2. 두번째 값 선택 (인접값 사용X)
    dp2 = [0] + sticker[1:]
    for i in range(2,size):
        dp2[i] = max(dp2[i-1],dp2[i-2]+dp2[i])
    
    # 두 방법 중 가장 큰 값
    answer = max(dp1[-1], dp2[-1])
    return answer
