# 가장 많이 받은 선물

def solution(friends, gifts):
    n = len(friends)
    
    friend_dict = dict()
    for i in range(n): # 테이블 인덱스처리
        friend_dict[friends[i]] = i
        
    table = [[0]*n for _ in range(n)] # 주고받은 선물내역 표 저장
    gift_p = [0]*n # 선물지수
        
    for gift in gifts:
        a,b = gift.split(" ") # 준사람, 받은사람
        idx1, idx2 = friend_dict[a], friend_dict[b] #테이블 인덱스랑 맞춰주기
        gift_p[idx1] += 1 # 주면 선물지수 +1
        gift_p[idx2] -= 1 # 받으면 선물지수 -1
        table[idx1][idx2] += 1 # a가 b에게 준 횟수
            
    answer = [0]*n # 각자 받아야하는 선물개수
    
    for i in range(n):
        for j in range(n):
            if i == j: # 동일인물은 무시
                continue
            if table[i][j] > table[j][i] : # 준게더많으면 받아야함
                answer[i] += 1
            elif table[i][j] == table[j][i]: # 주고받은게 같거나 주고받은적이 없으면
                if gift_p[i] > gift_p[j]: # 선물지수가 더 크면 = 준게 더 많은거 = 받아야함
                    answer[i] += 1
                    
    return max(answer)
