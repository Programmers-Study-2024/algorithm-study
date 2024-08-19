# 시저 암호

def solution(s, n):
    answer = ''   
    
    for i in s:
        a = ord(i)+n
        
        if i == " ":
            answer += " "
        elif (i.isupper() and a > 90) or (i.islower() and a > 122):
            answer += chr(a-26)[-1]
        else:
            answer += chr(a)
        # ord('A') = 65 / ord('Z') = 90
        # ord('a') = 97 / ord('z') = 122
    
    return answer
