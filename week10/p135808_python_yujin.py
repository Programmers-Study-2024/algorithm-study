# 과일 장수

def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    
    for idx in range(len(score)) :
        if (idx+1) % m == 0 :
            answer+=score[idx]*m
    
    return answer
