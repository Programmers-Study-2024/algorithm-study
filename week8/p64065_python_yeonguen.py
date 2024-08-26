# 튜플

# 1차 정답
def solution(s):
    answer = []
    lst = []
    s = s.split("{")
    for i in s:
        if i == "":
            continue
        else:
            i = i.split("}")
            for j in i:
                if j in [",",""]:
                    continue
                else:
                    j = j.split(",")
                    lst.append([j,len(j)])
    lst = sorted(lst, key = lambda x:x[1])
    for l in lst:
        for k in l[0]:
            if int(k) not in answer:
                answer.append(int(k))
    return answer

# 2차 정답
def solution(s):
    answer = []
    lst = s[2:-2].split("},{")
    lst = sorted(lst, key = lambda x:len(x))
    for l in lst:
        data = list(map(int,l.split(",")))
        for d in data:
            if d not in answer:
                answer.append(d)
        
    return answer
