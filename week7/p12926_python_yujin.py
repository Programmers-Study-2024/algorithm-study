# 시저 암호

def solution(s, n):
    answer = ''
    for i in s:
        #유니코드 -> ord(문자)
        if(i>='A' and i<='Z') :
            i = chr((ord(i) - ord('A') + n) % 26 + ord('A'))
        elif(i>='a' and i<='z') :
            i = chr((ord(i) - ord('a') + n) % 26 + ord('a'))
        answer+=i
    return answer
