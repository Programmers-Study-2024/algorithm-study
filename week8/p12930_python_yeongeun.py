# 이상한 문자 만들기

def solution(s):
    answer = ''
    # (단어기준) 짝수번째 대문자 / 홀수번째 소문자    
    for a in s.split(' '):
        for i in range(len(a)):
            if i%2 == 0:
                answer += a[i].upper()
            else:
                answer += a[i].lower()
        answer += ' '
    
    return answer[:-1]
