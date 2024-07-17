# 서울에서 김서방 찾기

def solution(seoul):
    answer = ''
    
    for i in range(0,len(seoul)) :
        if(seoul[i]=='Kim') : answer=f'김서방은 {i}에 있다'
        
    return answer
