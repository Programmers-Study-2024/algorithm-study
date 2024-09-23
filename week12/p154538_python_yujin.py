# 숫자 변환하기

def solution(x, y, n):
    answer = 0
    num=set()
    num.add(x)
    
    while len(num) > 0:
        if y in num :
            return answer
        # 3번의 경우 진행 y보다 작으면 num에 넣기
        else :
            num_y=set()
            for i in num :
                if i+n <= y :
                    num_y.add(i+n)
        
                if i*2 <= y :
                    num_y.add(i*2)
                    
                if i*3 <= y :
                    num_y.add(i*3)
            #print(num_y)
            num=num_y
            answer+=1
    return -1
