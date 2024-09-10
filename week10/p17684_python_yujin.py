# [3차] 압축

def solution(msg):
    answer = []
    dic = {chr(i+64) : i for i in range(1,27)}
    w,c=0,1
    while True:
        # 끝
        if c==len(msg):
            # dic[msg[w:c]] 출력
            answer.append((dic[msg[w:c]]))
            break
        
        # msg[w:c+1] not in dic
        if msg[w:c+1] not in dic :
            # dic[msg[w:c]] 출력
            answer.append(dic[msg[w:c]])
            # dic 추가
            dic[msg[w:c+1]]=len(dic)+1
            w=c
        else : 
            c+=1
            
    return answer
