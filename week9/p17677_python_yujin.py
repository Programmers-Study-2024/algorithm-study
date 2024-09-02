# [1차] 뉴스 클러스터링

from collections import Counter

def solution(str1, str2):
    answer = 0
    # 모두 대문자
    str1=str1.upper()
    str2=str2.upper()
    
    # 다중집합 원소
    str_1=[]
    str_2=[]
    
    for i in range(len(str1)-1): 
        if str1[i].isalpha() and str1[i+1].isalpha() :
            str_1.append(str1[i:i+2])
            
    for i in range(len(str2)-1): 
        if str2[i].isalpha() and str2[i+1].isalpha() :
            str_2.append(str2[i:i+2])
    
    # 교집합,합집합
    str_1=Counter(str_1)
    str_2=Counter(str_2)
    
    inter = list((str_1 & str_2).elements())
    union = list((str_1 | str_2).elements())
    
    # 유사도 출력
    if len(inter) == 0 and len(union) ==0 :
        return 65536
    else:
        return int(len(inter) / len(union) * 65536)
    
    return answer
