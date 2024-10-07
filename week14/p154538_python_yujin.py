# 숫자 변환하기

def solution(x, y, n):
    answer = 0
    num_x=set()
    num_x.add(x)
  
    while len(num_x) :
        if y in num_x :
            return answer
        else :
            num_y=set()
            for i in num_x:
                if i+n <= y :
                    num_y.add(i+n)
                if i*2 <= y :
                    num_y.add(i*2)
                if i*3 <= y :
                    num_y.add(i*3)
            num_x=num_y
            answer+=1
      
    return -1
