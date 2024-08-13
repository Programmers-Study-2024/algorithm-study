# 영어 끝말잇기

def solution(n, words):
    
    for i in range(1,len(words)):                
        before = words[i-1]
        after = words[i]
        if after in words[:i] or before[-1] != after[0] : # 끝말잇기 실패
            return [(i%n)+1,(i//n)+1]
        
    return [0,0]
