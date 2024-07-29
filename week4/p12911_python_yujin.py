# 다음 큰 숫자

def solution(n):
    Num=n+1
    
    while True : 
        if(format(n,'b').count("1") == format(Num,'b').count("1")) : 
            return Num
        Num+=1
