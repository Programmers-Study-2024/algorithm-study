# [1차]캐시

from collections import deque

def solution(cacheSize, cities):
    answer = 0
    
    cache=deque()
    
    for city in cities :
        city=city.lower()
        if city in cache:
            answer+=1
            cache.remove(city)
            cache.append(city)
        else :
            answer+=5
            cache.append(city)
            if(len(cache)>cacheSize):
                cache.popleft()
                
    return answer
