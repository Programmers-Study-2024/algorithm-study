# 베스트앨범

def solution(genres, plays):
    answer = []
    dic1 = {}
    dic2 = {}
    
    for i, (g,p) in enumerate(zip(genres, plays)):
        # 장르별 index, players 수
        if g not in dic1:
            dic1[g] = [(i,p)]
        else:
            dic1[g].append((i,p))
        
        # 장르별 재생횟수 총합 구하기
        if g not in dic2:
            dic2[g] = p
        else:
            dic2[g] += p
            
    print(dic1)
    
    # 장르별 총 재생 횟수(v)를 기준으로 dic2 내림차순 
    for (k,v) in sorted(dic2.items(), key = lambda x:x[1], reverse=True):
        # 같은 장르(k)에서 가장 많이 재생된 노래 2곡 dic1 [:2]
        for (i,p) in sorted(dic1[k], key = lambda x:x[1], reverse=True)[:2]:
            answer.append(i)
    
    return answer
