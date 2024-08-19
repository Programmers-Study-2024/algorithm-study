# 의상

def solution(clothes):
    closet = {} 
    for name, kind in clothes:
        if kind in closet.keys():
            closet[kind] += [name]
        else:
            closet[kind] = [name]
    #print(closet)
    answer = 1
    for key, value in closet.items():
        answer *= (len(value) + 1)
        
    return answer -1
