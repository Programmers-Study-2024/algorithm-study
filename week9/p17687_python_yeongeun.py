# [3차] n진수 게임

def solution(n, t, m, p):
    
    num = '0' # 0은 어떤 진법도 항상 0
    i = 1 # 숫자 +1씩 올리면서 진법 변환
    
    # m명이 말해야 하는 숫자(t*m개)까지
    while True:
        if len(num) >= t*m:
            break
        
        # 진법 계산
        a = ''
        j = i
        while j > 0:
            j, mod = divmod(j,n)
            b = str(mod)
            
            # 10~15 처리
            if b == '10':
                a += 'A'
            elif b == '11':
                a += 'B'
            elif b == '12':
                a += 'C'
            elif b == '13':
                a += 'D'
            elif b == '14':
                a += 'E'
            elif b == '15':
                a += 'F'
            else:
                a += b
        
        num += a[::-1]
        i += 1
    
    # 튜브가 말해야 하는 숫자 (p-1번째부터 m개씩 띄어서, t까지)
    answer = num[p-1::m][:t]
    
    return answer
