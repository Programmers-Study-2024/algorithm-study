#이진 변환 반복하기

def solution(s):
    rm,num=0,0
    while(s!='1') :
        Zero =s.count('0')
        # format 함수
        s= format(len(s)-Zero,'b')
        num+=1
        rm+=Zero
        
    return [num,rm]
