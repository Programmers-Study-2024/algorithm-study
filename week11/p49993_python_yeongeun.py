# 스킬트리

def solution(skill, skill_trees):
    answer = 0
    
    # 가능한 모든 조합
    list_a = []
    for i in range(1,len(skill)+1):
        list_a.append(skill[:i])
        
    for t in skill_trees:
        stack = []
        flag = True
        for i in range(len(t)): # 알파벳 t[i]
            if t[i] in skill:
                stack.append(t[i])
            if stack and ''.join(stack) not in list_a:
                flag = False
                break
        if flag:
            answer += 1

    return answer
