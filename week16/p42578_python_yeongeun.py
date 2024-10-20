# 의상

def solution(clothes):    
    # 옷 종류별 개수 세기
    dic = dict()
    for clothe, type in clothes:
        dic[type] = dic.get(type,0) + 1
    
    answer = 1
    for i in dic:
        answer *= (dic[i]+1)
        
    return answer - 1
