# [1차] 캐시

def solution(cacheSize, cities):
    answer = 0
    cache = []
    for city in cities:
        city = city.lower()
        if cacheSize:
            if city not in cache: # miss (추가)
                if len(cache) == cacheSize:
                    cache.pop(0) #가장 참조되지않은 거 pop
                cache.append(city)
                answer += 5
                 
            else: # hit (이미있음)
                cache.pop(cache.index(city)) # 이전꺼 삭제
                cache.append(city) # 가장 최근참조
                answer += 1
                
        else: # 캐시 공간 0인 경우
            answer += 5
    
    return answer
