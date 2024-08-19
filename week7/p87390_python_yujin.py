# n^2 배열 자르기

def solution(n, left, right):
    answer = []
    for i in range(left,right+1):
        a = i//n # 몫
        b = i%n #나머지 
        if a<b: a,b =b,a # 큰거 구하기 
        answer.append(a+1)
    
    return answer
