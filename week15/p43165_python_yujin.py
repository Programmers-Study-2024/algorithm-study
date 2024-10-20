# 타겟 넘버

def dfs(numbers,target,idx,result) :
    global answer
    if idx == len(numbers):
        if result == target :
            answer+=1
        return

    dfs(numbers, target,idx+1,result+numbers[idx])
    dfs(numbers, target,idx+1,result-numbers[idx])


def solution(numbers, target):
    global answer
    answer = 0
    dfs(numbers,target,0,0)
    
    return answer
