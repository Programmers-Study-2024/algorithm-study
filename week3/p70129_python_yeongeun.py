# 이진 변환 반복하기

# 이진 변환
def trans(c):
    result = []
    while c != 1:
        if c%2 == 0:
            result.append('0')
        else:
            result.append('1')
        c //= 2
    result.append('1')
    return result[::-1]
    
# 1의 개수 세기
def count1(input_s):
    c = 0
    for i in list(input_s):
        if i == '1':
            c += 1
    return c

def solution(s):
    a,b = 1,0  # 기본 1회차부터 시작하므로 a = 1
    while True:
        result = count1(s)
        if result == 1: # 1의 개수가 1이면, 이진변환해도 1
            return [a,b+(len(s)-result)] # 마지막 회차에서 0의 개수 더해주기
        
        b += len(s)-result # 제거한 0의 개수 총합
        s = trans(result)
        a += 1 # 이진변환 횟수
        
    return [a,b]
