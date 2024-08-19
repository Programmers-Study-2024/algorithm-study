# 최고의 집합

def solution(n, s):
    answer = []
    if s-n < 0:
        return [-1]
    
    num = s//n
    rest = s%n
    
    for _ in range(n):
        answer.append(num) # 몫을 n만큼 넣어주기
    if rest != 0: # 나누어 떨어지지 않으면
        for a in range(len(answer)):
            answer[a] += 1 # 1씩 분배해서 추가해주기
            rest -= 1
            if rest == 0:
                break
    answer.sort()
            
    return answer
