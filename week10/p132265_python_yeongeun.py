# 롤케이크 자르기

from collections import Counter

def solution(topping):
    answer = 0
    dic = Counter(topping)
    set_dic = set()
    
    for i in topping:
        # 토핑 한개씩 dic에서 빼서 set_dic에 추가
        dic[i] -= 1
        set_dic.add(i)
        # 해당 토핑 없으면 dic에서 아예 pop해주기
        if dic[i] == 0:
            dic.pop(i)
        # 두집합 수 같으면, 공평
        if len(dic) == len(sec_dic):
            answer += 1

    return answer
