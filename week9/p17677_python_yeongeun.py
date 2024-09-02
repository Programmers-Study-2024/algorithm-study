# [1차] 뉴스 클러스터링

from collections import Counter

def solution(str1, str2):
    # 두글자씩 끊어서 문자일 때만 저장
    str1 = str1.lower()
    str2 = str2.lower()
    lst1,lst2 = [], []
    for i in range(len(str1)-1):
        if str1[i].isalpha() and str1[i+1].isalpha():
            lst1.append(str1[i:i+2])
    for j in range(len(str2)-1):
        if str2[j].isalpha() and str2[j+1].isalpha():
            lst2.append(str2[j:j+2])
            
    # 개수세기
    counter1 = Counter(lst1)
    counter2 = Counter(lst2)
    inter = list((counter1 & counter2).elements())
    union = list((counter1 | counter2).elements())
    
    # 계산
    if len(inter) == 0 and len(union) == 0:
        return 65536
    else:
        return int(len(inter)/len(union)*65536)
    
