# 할인 행사

from collections import Counter

def solution(want, number, discount):
    answer = 0
    dict = {}
    for i in range(len(want)):
        dict[want[i]] = number[i]
        
    for i in range(len(discount) - 9):
        cnt = Counter(discount[i:i + 10])
        if cnt == dict:
            answer += 1
            
    #a = Counter(discount)
    #print(a)
    return answer

    
