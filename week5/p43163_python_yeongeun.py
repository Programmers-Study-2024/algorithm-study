# 단어 변환

from collections import deque

def solution(begin, target, words):
    if target not in words: # 타깃이 words 안에 없는 경우
        return 0
    
    q = deque()
    q.append([begin,0]) # [현재 단어, 현재 단어가 되기까지의 변경 과정 횟수] 
    
    while q :
        x,cnt = q.popleft()
        
        if x == target: # target 도달시 cnt return
            return cnt
        
        for word in words:
            diff = 0
            for j in range(len(word)): # 각 알파벳 비교
                if x[j] != word[j]:
                    diff += 1
            if diff == 1: # 한단어만 다를 때, 변경할 수 있음
                q.append([word,cnt+1])
    return 0
