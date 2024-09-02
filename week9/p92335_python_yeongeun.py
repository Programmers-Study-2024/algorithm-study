# k진수에서 소수 개수 구하기

def solution(n, k):    
    # 진수 변환
    nk = ''
    while n > 0 :
        n, mod = divmod(n,k) # n을 k로 나눈 몫, 나머지
        nk += str(mod)
    nk = nk[::-1] # 뒤집어줘야함
    
    # 0을 기준으로 나누기
    nk = nk.split('0')
    
    # 소수 여부
    answer = 0
    for i in nk:
        if len(i) == 0:
            continue
        if int(i) < 2:
            continue
            
        flag = True
        for j in range(2, int(int(i)**0.5)+1):
            if int(i)%j == 0:
                flag = False
                break
                
        if flag:
            answer += 1
    return answer
