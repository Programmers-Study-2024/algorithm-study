# 튜플

def solution(s):
    answer = []
    s = s[2:-2]
    s = s.split("},{")
    #print(s)
    # 길이로 정렬
    s.sort(key = len)
    
    for i in s:
        j = i.split(',')
        #print(j)
        for k in j:
            if int(k) not in answer:
                answer.append(int(k))
    return answer
