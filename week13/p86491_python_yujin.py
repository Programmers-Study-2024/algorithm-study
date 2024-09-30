# 최소직사각형

def solution(sizes):
    w=[]
    h=[]
    for size in sizes:
        w.append(max(size))
        h.append(min(size))
    #print(w,h)
    return max(w)*max(h)
