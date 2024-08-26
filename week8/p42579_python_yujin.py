# 베스트앨범

def solution(genres, plays):
    answer = []
    
    genre={} # 장르 : [재생횟수,인덱스]
    play={} # 장르 : 총 play
    
    for i in range (len(genres)) :
        if genres[i] in play:
            play[genres[i]] += plays[i]
        else:
            play[genres[i]] = plays[i]
            
        if genres[i] in genre:
            genre[genres[i]].append([plays[i], i])
        else:
            genre[genres[i]] = [[plays[i], i]]
    
    #print(genre)
    #print(play)
    
    genrelist=sorted(play.items(),key=lambda x : x[1], reverse=True)
    
    #print(genrelist)
    
    for (g, p) in genrelist :
        # 재생횟수 내림차순
        genre[g] = sorted(genre[g],key=lambda x : x[0], reverse=True)
    
    print(genre)
    
    for (g, p) in genrelist :
        answer+=[j for (i,j) in genre[g][:2]]
        
    return answer
