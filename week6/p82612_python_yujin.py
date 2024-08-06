# 부족한 금액 계산하기

def solution(price, money, count):
    answer = 0
    
    for i in range(0, count) :
        answer+=price*(i+1)
    if( answer < money) : return 0  
    else : 
        answer-=money 
        return answer    
