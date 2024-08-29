# 기사단원의 무기

def solution(number, limit, power):
    
    answer = 1
    for i in range(2,number+1):
        cnt = 0
        # 약수의 개수
        for j in range(1,int(i**(1/2)+1)):
            if i%j == 0:
                cnt += 1
                if j ** 2 != i: # 5X5로 값이 같지 않다면 경우, 짝도 추가
                    cnt += 1
        # limit 초과하면 power로 대체
        if cnt > limit:
            cnt = power
        answer += cnt
    return answer
