# 이중우선순위 큐

def solution(operations):
    answer = []
    
    for i in operations :
        # I,D 와 숫자 나누기
        tmp, num = i.split()
        if tmp == 'I' : 
            answer.append(int(num))
        else :
            if (answer != []) :
                if num == '-1':
                    answer.remove(min(answer))
                else : 
                    answer.remove(max(answer))
                    
    if(answer!=[]): return [max(answer),min(answer)]
    else : return [0,0]
