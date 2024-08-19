# 할인 행사

def solution(want, number, discount):
    answer = 0

    for i in range(0,len(discount)-10+1): # 10일 연속
        # 제품 종류별 개수세기
        dic = {}
        for d in discount[i:i+10]:
            try: dic[d] += 1
            except: dic[d] = 1
        # want 개수와 일치하는지 비교
        for i in range(len(want)):
            if want[i] in dic and dic[want[i]] >= number[i]:
                flag = True
            else:
                flag = False
                break
        if flag : answer += 1
    return answer
