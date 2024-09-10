# 보석 쇼핑

from collections import Counter

def solution(gems):
    answer = []
    gemCnt=len(set(gems))
    gemlist=Counter()
    start=0
    
    for end in range(len(gems)):
        gemlist[gems[end]]+=1
        
        while len(gemlist) == gemCnt :
            answer.append((start+1,end+1))
            gemlist[gems[start]]-=1
          
            if gemlist[gems[start]] == 0:
                del gemlist[gems[start]]
            
            start+=1
    answer.sort(key=lambda x: (x[1]-x[0]))
    return answer[0]
