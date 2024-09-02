# [3차] n진수 게임

def solution(n, t, m, p):
    answer = ''
    game ='' 
    for i in range(m*t) :
        game += str(change(i,n))
    
    while len(answer) < t :
        answer += game[p-1]
        p += m
    
    return answer.upper()

def change(i, n) :
    arr = "0123456789ABCDEF"
    q,r = divmod(i,n) 
    if q==0 :
        return arr[r]
    else : 
        return change(q,n)+arr[r]
