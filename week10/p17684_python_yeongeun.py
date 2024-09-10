# [3차] 압축

def solution(msg):
    answer = []
    # 65:A
    dic = {chr(i+64):i for i in range(1,27)}
    w = c = 0
    
    while True:
        c += 1
        if c == len(msg): # 마지막 글자라면
            answer.append(dic[msg[w:c]])
            break            
            
        if msg[w:c+1] not in dic: # 다음글자가 없다면
            dic[msg[w:c+1]] = len(dic)+1            
            answer.append(dic[msg[w:c]])
            w = c # 다음글자로 위치 이동
    # KA 추가. K 출력 / AK 추가. A 출력 / KA 있음 넘어감 / KAO 없음. KA 출력 / O 출력

    return answer
