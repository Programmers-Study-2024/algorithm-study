# 스티커 모으기(2)

def solution(sticker):
    answer = 0
    
    # 값 1개밖에 없는 경우 처리
    if len(sticker) == 1:
        return sticker.pop()
    
    size = len(sticker)
    # 첫번째 값 사용시
    # 인덱스 오류 방지 : 앞에 임시로0 넣어주기
    dp1 = [0] + sticker[:-1] # 마지막 값 사용 X
    for i in range(2,size):
        # 최적의 값으로 해당값 업데이트
        # max(1칸전까지의 최대값, 2칸전까지의 최대값 + 현재 값)
        dp1[i] = max(dp1[i-1], dp1[i-2] + dp1[i])
        
    # 두번째 값 사용시
    dp2 = [0] + sticker[1:] # 인접값 사용 X
    for i in range(2,size):
        dp2[i] = max(dp2[i-1], dp2[i-2] + dp2[i])
    
    answer = max(dp1[-1], dp2[-1])
    return answer
