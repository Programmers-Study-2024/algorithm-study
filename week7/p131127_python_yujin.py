# 할인 행사

from collections import Counter

def solution(want, number, discount):
    answer = 0
    dict = {}
    for i in range(len(want)):
        dict[want[i]] = number[i]
    #print(dict)
    
    for i in range(len(discount) - 9):
        cnt = Counter(discount[i:i + 10])
        #print(cnt)
        if cnt == dict:
            answer += 1
        
    return answer

    
