# 스킬트리

def solution(skill, skill_trees):
    answer = 0
    
    for skill_tree in skill_trees :
        s=""
        for skills in skill_tree:
            if skills in skill :
                # skill에 있는 skill 들만 뽑기
                s+=skills
          
        # skill과 s 순서 비교
        if skill[:len(s)]==s:
            answer+=1
    return answer
