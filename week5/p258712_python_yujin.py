# 가장 많이 받은 선물 / 해설 참고

def solution(friends, gifts):
    result = []
    gift_cnt = {}
    gift_idx = {}
    
    # 주고받을 수 있는 친구 조합
    for a in friends:
        for b in friends:
            if a==b:
                continue
            gift_cnt[a+" "+b] = 0  
    
    # 선물 지수 리스트
    for friend in friends:
        gift_idx[friend] = 0
    
    # 선물 주고받은 기록
    for gift in gifts:
        gift_cnt[gift] += 1
        
    # 선물 지수 계산
        gift_idx[gift.split()[0]] += 1
        gift_idx[gift.split()[1]] -= 1
    
    # 계산..
    for a in friends:
        cnt = 0
        for b in friends:
            if a == b:
                continue
            if gift_cnt[a+" "+b] > gift_cnt[b+" "+a]:
                cnt += 1
            elif gift_cnt[a+" "+b] == gift_cnt[b+" "+a] and gift_idx[a]>gift_idx[b]:
                cnt += 1
        result.append(cnt)
    
    return max(result)
