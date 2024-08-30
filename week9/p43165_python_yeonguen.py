# 타겟 넘버

answer = 0
def DFS(depth,numbers,target,total):
    global answer # 전역변수
    N = len(numbers)
    if depth == N and target == total: # 조건만족
        answer += 1
        return
    if depth == N: # 조건불만족
        return
    DFS(depth+1,numbers,target,total+numbers[depth]) # +
    DFS(depth+1,numbers,target,total-numbers[depth]) # -
    
def solution(numbers,target):
    global answer # 전역변수 지정
    # 초기값 depth = 0, total = 0
    DFS(0,numbers,target,0)
    return answer
