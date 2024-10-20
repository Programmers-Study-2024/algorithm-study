# 타겟 넘버

answer = 0
def dfs(depth,numbers,target,total):
    global answer
    n = len(numbers)
    if depth == n and target == total:
        answer += 1
        return
    if depth == n:
        return
    
    dfs(depth+1,numbers,target,total+numbers[depth])
    dfs(depth+1,numbers,target,total-numbers[depth])
    

def solution(numbers,target):
    global answer
    dfs(0,numbers,target,0)    
    return answer
