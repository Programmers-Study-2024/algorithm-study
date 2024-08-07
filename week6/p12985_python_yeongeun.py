# 예상 대진표

def solution(n,a,b):
    answer = 0
    while a != b:
        # 2로 나누어 떨어지면 나누기, 아니면 +1
        # 4->2 / 7->4
        if int(a/2) == a/2:
            a = a//2
        else:
            a = a//2+1
        if int(b/2) == b/2:
            b = b//2
        else:
            b = b//2+1
        # 1,2번인 경우 +1 해야하므로 a와 b가 다를때까지 while문 반복
        answer += 1
    return answer
